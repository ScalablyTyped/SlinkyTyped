package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/typography/Editable.EditableState> */
@js.native
trait PartialEditableState extends js.Object {
  var current: js.UndefOr[String] = js.native
  var prevValue: js.UndefOr[String] = js.native
}

object PartialEditableState {
  @scala.inline
  def apply(): PartialEditableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditableState]
  }
  @scala.inline
  implicit class PartialEditableStateOps[Self <: PartialEditableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValue")(js.undefined)
        ret
    }
  }
  
}

