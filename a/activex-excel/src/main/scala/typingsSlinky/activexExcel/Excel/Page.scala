package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  val CenterFooter: HeaderFooter = js.native
  val CenterHeader: HeaderFooter = js.native
  @JSName("Excel.Page_typekey")
  var ExcelDotPage_typekey: Page = js.native
  val LeftFooter: HeaderFooter = js.native
  val LeftHeader: HeaderFooter = js.native
  val RightFooter: HeaderFooter = js.native
  val RightHeader: HeaderFooter = js.native
}

object Page {
  @scala.inline
  def apply(
    CenterFooter: HeaderFooter,
    CenterHeader: HeaderFooter,
    ExcelDotPage_typekey: Page,
    LeftFooter: HeaderFooter,
    LeftHeader: HeaderFooter,
    RightFooter: HeaderFooter,
    RightHeader: HeaderFooter
  ): Page = {
    val __obj = js.Dynamic.literal(CenterFooter = CenterFooter.asInstanceOf[js.Any], CenterHeader = CenterHeader.asInstanceOf[js.Any], LeftFooter = LeftFooter.asInstanceOf[js.Any], LeftHeader = LeftHeader.asInstanceOf[js.Any], RightFooter = RightFooter.asInstanceOf[js.Any], RightHeader = RightHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Page_typekey")(ExcelDotPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterFooter(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CenterFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterHeader(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CenterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotPage_typekey(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Page_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftFooter(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftHeader(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightFooter(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightHeader(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

