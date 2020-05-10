package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the HeaderFooter object, for use in `headerFooter.set({ ... })`. */
@js.native
trait HeaderFooterUpdateData extends js.Object {
  /**
    *
    * Gets or sets the center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[String] = js.native
}

object HeaderFooterUpdateData {
  @scala.inline
  def apply(): HeaderFooterUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterUpdateData]
  }
  @scala.inline
  implicit class HeaderFooterUpdateDataOps[Self <: HeaderFooterUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRightFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRightHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightHeader")(js.undefined)
        ret
    }
  }
  
}

