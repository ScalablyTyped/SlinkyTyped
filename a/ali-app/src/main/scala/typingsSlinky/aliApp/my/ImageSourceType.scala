package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.camera_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 图片 https://docs.alipay.com/mini/api/media-image
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliApp.aliAppStrings.album
  - typingsSlinky.aliApp.aliAppStrings.camera_
*/
trait ImageSourceType extends js.Object

object ImageSourceType {
  @scala.inline
  def album: typingsSlinky.aliApp.aliAppStrings.album = this.cast("album")
  @scala.inline
  def camera: camera_ = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

