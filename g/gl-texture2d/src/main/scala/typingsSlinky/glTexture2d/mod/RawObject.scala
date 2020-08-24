package typingsSlinky.glTexture2d.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawObject extends js.Object {
  var height: Double = js.native
  var raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap = js.native
  var width: Double = js.native
}

object RawObject {
  @scala.inline
  def apply(height: Double, raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap, width: Double): RawObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawObject]
  }
  @scala.inline
  implicit class RawObjectOps[Self <: RawObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: js.typedarray.ArrayBufferView | InputType | ImageBitmap): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawHTMLVideoElement(value: HTMLVideoElement): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawHTMLImageElement(value: HTMLImageElement): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawImageData(value: ImageData): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

