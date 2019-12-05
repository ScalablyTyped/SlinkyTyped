package typingsSlinky.atJimpJpeg.atJimpJpegMod

import typingsSlinky.atJimpCore.typesEtcMod.ImageCallback
import typingsSlinky.atJimpJpeg.atJimpJpegStrings.`image/jpeg`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegClass extends js.Object {
  var MIME_JPEG: `image/jpeg` = js.native
  var _quality: Double = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
}

