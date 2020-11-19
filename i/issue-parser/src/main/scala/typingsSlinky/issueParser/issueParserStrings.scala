package typingsSlinky.issueParser

import typingsSlinky.issueParser.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueParserStrings {
  
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  
  @scala.inline
  def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
  
  @scala.inline
  def waffle: waffle = "waffle".asInstanceOf[waffle]
  
  @js.native
  sealed trait bitbucket extends Options
  
  @js.native
  sealed trait github extends Options
  
  @js.native
  sealed trait gitlab extends Options
  
  @js.native
  sealed trait waffle extends Options
}
