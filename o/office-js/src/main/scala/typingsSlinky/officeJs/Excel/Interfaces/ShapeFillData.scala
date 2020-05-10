package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ShapeFillType
import typingsSlinky.officeJs.officeJsStrings.Gradient
import typingsSlinky.officeJs.officeJsStrings.Mixed
import typingsSlinky.officeJs.officeJsStrings.NoFill
import typingsSlinky.officeJs.officeJsStrings.Pattern
import typingsSlinky.officeJs.officeJsStrings.PictureAndTexture
import typingsSlinky.officeJs.officeJsStrings.Solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeFill.toJSON()`. */
@js.native
trait ShapeFillData extends js.Object {
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
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed] = js.native
}

object ShapeFillData {
  @scala.inline
  def apply(): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFillData]
  }
  @scala.inline
  implicit class ShapeFillDataOps[Self <: ShapeFillData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withType(value: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

