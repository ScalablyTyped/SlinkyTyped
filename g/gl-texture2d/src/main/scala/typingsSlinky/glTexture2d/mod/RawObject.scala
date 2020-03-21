package typingsSlinky.glTexture2d.mod

import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawObject extends js.Object {
  var height: Double
  var raw: scala.scalajs.js.typedarray.ArrayBufferView | InputType | ImageBitmap
  var width: Double
}

object RawObject {
  @scala.inline
  def apply(
    height: Double,
    raw: scala.scalajs.js.typedarray.ArrayBufferView | InputType | ImageBitmap,
    width: Double
  ): RawObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawObject]
  }
}

