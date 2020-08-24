package typingsSlinky.openlayers.mod.olx.style

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.openlayers.mod.ColorLike_
import typingsSlinky.openlayers.mod.Color_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillOptions extends js.Object {
  var color: js.UndefOr[Color_ | ColorLike_] = js.native
}

object FillOptions {
  @scala.inline
  def apply(): FillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOptions]
  }
  @scala.inline
  implicit class FillOptionsOps[Self <: FillOptions] (val x: Self) extends AnyVal {
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
    def setColorUint8Array(value: js.typedarray.Uint8Array): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorCanvasPattern(value: CanvasPattern): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color_ | ColorLike_): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorCanvasGradient(value: CanvasGradient): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

