package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeDrawingBrush extends js.Object {
  /**
  	 * Can be any regular color value.
  	 */
  var color: String = js.native
  /**
  	 * Brush width measured in pixels.
  	 */
  var width: Double = js.native
}

object FreeDrawingBrush {
  @scala.inline
  def apply(color: String, width: Double): FreeDrawingBrush = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeDrawingBrush]
  }
  @scala.inline
  implicit class FreeDrawingBrushOps[Self <: FreeDrawingBrush] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

