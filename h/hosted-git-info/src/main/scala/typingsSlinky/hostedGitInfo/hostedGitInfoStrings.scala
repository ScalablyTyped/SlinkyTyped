package typingsSlinky.hostedGitInfo

import typingsSlinky.hostedGitInfo.mod.Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedGitInfoStrings {
  
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  
  @scala.inline
  def gist: gist = "gist".asInstanceOf[gist]
  
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  
  @scala.inline
  def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
  
  @js.native
  sealed trait bitbucket extends Hosts
  
  @js.native
  sealed trait gist extends Hosts
  
  @js.native
  sealed trait github extends Hosts
  
  @js.native
  sealed trait gitlab extends Hosts
}
