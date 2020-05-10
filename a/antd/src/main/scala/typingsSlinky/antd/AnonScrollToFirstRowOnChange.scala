package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.native
}

object AnonScrollToFirstRowOnChange {
  @scala.inline
  def apply(): AnonScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonScrollToFirstRowOnChange]
  }
  @scala.inline
  implicit class AnonScrollToFirstRowOnChangeOps[Self <: AnonScrollToFirstRowOnChange] (val x: Self) extends AnyVal {
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

