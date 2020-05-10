package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in page layout margins.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutMarginOptions extends js.Object {
  /**
    *
    * Represents the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footer: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var header: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.native
}

object PageLayoutMarginOptions {
  @scala.inline
  def apply(): PageLayoutMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutMarginOptions]
  }
  @scala.inline
  implicit class PageLayoutMarginOptionsOps[Self <: PageLayoutMarginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

