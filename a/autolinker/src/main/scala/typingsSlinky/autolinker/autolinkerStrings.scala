package typingsSlinky.autolinker

import typingsSlinky.autolinker.autolinkerMod.HashtagConfig
import typingsSlinky.autolinker.autolinkerMod.HashtagServices
import typingsSlinky.autolinker.autolinkerMod.MentionConfig
import typingsSlinky.autolinker.autolinkerMod.MentionServices
import typingsSlinky.autolinker.autolinkerMod.UrlMatchTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerStrings {
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @scala.inline
  def instagram: instagram = "instagram".asInstanceOf[instagram]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @scala.inline
  def smart: smart = "smart".asInstanceOf[smart]
  
  @scala.inline
  def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  
  @scala.inline
  def tld: tld = "tld".asInstanceOf[tld]
  
  @scala.inline
  def twitter: twitter = "twitter".asInstanceOf[twitter]
  
  @scala.inline
  def www: www = "www".asInstanceOf[www]
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait facebook
    extends HashtagConfig
       with HashtagServices
  
  @js.native
  sealed trait instagram
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait scheme extends UrlMatchTypeOptions
  
  @js.native
  sealed trait smart extends js.Object
  
  @js.native
  sealed trait soundcloud
    extends MentionConfig
       with MentionServices
  
  @js.native
  sealed trait tld extends UrlMatchTypeOptions
  
  @js.native
  sealed trait twitter
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  
  @js.native
  sealed trait www extends UrlMatchTypeOptions
}
