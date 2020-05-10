package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageMethodeModelInfoReturn extends js.Object {
  var end: Double = js.native
  var length: Double = js.native
  var page: Double = js.native
  var pages: Double = js.native
  var recordsDisplay: Double = js.native
  var recordsTotal: Double = js.native
  var serverSide: Boolean = js.native
  var start: Double = js.native
}

object PageMethodeModelInfoReturn {
  @scala.inline
  def apply(
    end: Double,
    length: Double,
    page: Double,
    pages: Double,
    recordsDisplay: Double,
    recordsTotal: Double,
    serverSide: Boolean,
    start: Double
  ): PageMethodeModelInfoReturn = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], recordsDisplay = recordsDisplay.asInstanceOf[js.Any], recordsTotal = recordsTotal.asInstanceOf[js.Any], serverSide = serverSide.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageMethodeModelInfoReturn]
  }
  @scala.inline
  implicit class PageMethodeModelInfoReturnOps[Self <: PageMethodeModelInfoReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordsDisplay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

