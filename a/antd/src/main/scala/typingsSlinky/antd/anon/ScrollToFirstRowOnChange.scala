package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.native
}

object ScrollToFirstRowOnChange {
  @scala.inline
  def apply(): ScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToFirstRowOnChange]
  }
  @scala.inline
  implicit class ScrollToFirstRowOnChangeOps[Self <: ScrollToFirstRowOnChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollToFirstRowOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToFirstRowOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToFirstRowOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToFirstRowOnChange")(js.undefined)
        ret
    }
  }
  
}

