package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeFill object, for use in `shapeFill.set({ ... })`. */
@js.native
trait ShapeFillUpdateData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[String] = js.native
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.native
}

object ShapeFillUpdateData {
  @scala.inline
  def apply(): ShapeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFillUpdateData]
  }
  @scala.inline
  implicit class ShapeFillUpdateDataOps[Self <: ShapeFillUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
  }
  
}

