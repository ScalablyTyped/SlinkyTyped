package typingsSlinky.jui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  /**
    * @cfg {Integer} [count=0]
    * Total number of data records subject to paging)
    */
  var count: js.UndefOr[Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [pageCount=10]
    * Number of data records per page
    */
  var pageCount: js.UndefOr[Double] = js.native
  /**
    * @cfg {Integer} [screenCount=5]
    * Number of pages shown on the paging screen
    */
  var screenCount: js.UndefOr[Double] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object Count {
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

