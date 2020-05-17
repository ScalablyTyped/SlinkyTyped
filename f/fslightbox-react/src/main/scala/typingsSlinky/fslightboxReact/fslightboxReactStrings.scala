package typingsSlinky.fslightboxReact

import typingsSlinky.fslightboxReact.mod.SourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fslightboxReactStrings {
  @js.native
  sealed trait image extends SourceType
  
  @js.native
  sealed trait video extends SourceType
  
  @js.native
  sealed trait youtube extends SourceType
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def youtube: youtube = "youtube".asInstanceOf[youtube]
}

