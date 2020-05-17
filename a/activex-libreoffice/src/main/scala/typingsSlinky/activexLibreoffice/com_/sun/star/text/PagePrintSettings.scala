package typingsSlinky.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These properties describe the way the {@link XPagePrintable} interface prints the page on one printer page. */
@js.native
trait PagePrintSettings extends js.Object {
  /** contains the right margin of the printer page. */
  var BottomMargin: Double = js.native
  /** contains the margin between the rows of printed pages. */
  var HoriMargin: Double = js.native
  /** defines if the printer page is used in landscape format. */
  var IsLandscape: Boolean = js.native
  /** contains the left margin of the printer page. */
  var LeftMargin: Double = js.native
  /** contains the number of pages per printed row of pages. */
  var PageColumns: Double = js.native
  /** contains the number of pages per printed column of pages. */
  var PageRows: Double = js.native
  /** contains the right margin of the printer page. */
  var RightMargin: Double = js.native
  /** contains the top margin of the printer page. */
  var TopMargin: Double = js.native
  /** contains the margin between the columns of printed pages. */
  var VertMargin: Double = js.native
}

object PagePrintSettings {
  @scala.inline
  def apply(
    BottomMargin: Double,
    HoriMargin: Double,
    IsLandscape: Boolean,
    LeftMargin: Double,
    PageColumns: Double,
    PageRows: Double,
    RightMargin: Double,
    TopMargin: Double,
    VertMargin: Double
  ): PagePrintSettings = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin.asInstanceOf[js.Any], HoriMargin = HoriMargin.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], VertMargin = VertMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePrintSettings]
  }
  @scala.inline
  implicit class PagePrintSettingsOps[Self <: PagePrintSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoriMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoriMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertMargin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

