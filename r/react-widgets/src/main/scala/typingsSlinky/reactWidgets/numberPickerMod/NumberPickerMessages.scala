package typingsSlinky.reactWidgets.numberPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberPickerMessages extends js.Object {
  /**
    * Number picker spinner down button text for screen readers.
    * @default "decrement value"
    */
  var decrement: js.UndefOr[String] = js.native
  /**
    * Number picker spinner up button text for screen readers.
    * @default "increment value"
    */
  var increment: js.UndefOr[String] = js.native
}

object NumberPickerMessages {
  @scala.inline
  def apply(): NumberPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberPickerMessages]
  }
  @scala.inline
  implicit class NumberPickerMessagesOps[Self <: NumberPickerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrement")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
  }
  
}

