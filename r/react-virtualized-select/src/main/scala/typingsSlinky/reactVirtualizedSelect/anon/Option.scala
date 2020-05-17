package typingsSlinky.reactVirtualizedSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[TValue] extends js.Object {
  var option: TValue = js.native
}

object Option {
  @scala.inline
  def apply[TValue](option: TValue): Option[TValue] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[TValue]]
  }
  @scala.inline
  implicit class OptionOps[Self[tvalue] <: Option[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withOption(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

