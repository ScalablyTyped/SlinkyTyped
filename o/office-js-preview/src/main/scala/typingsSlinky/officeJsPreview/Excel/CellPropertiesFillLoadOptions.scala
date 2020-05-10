package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.fill` object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFillLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.native
}

object CellPropertiesFillLoadOptions {
  @scala.inline
  def apply(): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
  @scala.inline
  implicit class CellPropertiesFillLoadOptionsOps[Self <: CellPropertiesFillLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternTintAndShade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternTintAndShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTintAndShade")(js.undefined)
        ret
    }
    @scala.inline
    def withTintAndShade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintAndShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(js.undefined)
        ret
    }
  }
  
}

