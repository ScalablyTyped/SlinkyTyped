package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeFbsdk.mod.ShareLinkContent
  - typingsSlinky.reactNativeFbsdk.mod.SharePhotoContent
  - typingsSlinky.reactNativeFbsdk.mod.ShareVideoContent
  - typingsSlinky.reactNativeFbsdk.mod.ShareOpenGraphContent
*/
trait ShareContent extends js.Object

object ShareContent {
  @scala.inline
  implicit def apply(value: ShareLinkContent): ShareContent = value.asInstanceOf[ShareContent]
  @scala.inline
  implicit def apply(value: ShareOpenGraphContent): ShareContent = value.asInstanceOf[ShareContent]
  @scala.inline
  implicit def apply(value: SharePhotoContent): ShareContent = value.asInstanceOf[ShareContent]
  @scala.inline
  implicit def apply(value: ShareVideoContent): ShareContent = value.asInstanceOf[ShareContent]
}

