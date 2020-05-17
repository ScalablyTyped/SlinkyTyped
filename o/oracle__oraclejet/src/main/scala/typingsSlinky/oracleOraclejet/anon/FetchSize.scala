package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchSize extends js.Object {
  var fetchSize: js.UndefOr[Double] = js.native
  var maxCount: js.UndefOr[Double] = js.native
  var scroller: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
}

object FetchSize {
  @scala.inline
  def apply(): FetchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchSize]
  }
  @scala.inline
  implicit class FetchSizeOps[Self <: FetchSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withScroller(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(js.undefined)
        ret
    }
  }
  
}

