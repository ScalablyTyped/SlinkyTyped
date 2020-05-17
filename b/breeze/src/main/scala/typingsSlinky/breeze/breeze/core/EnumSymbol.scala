package typingsSlinky.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumSymbol extends js.Object {
  var parentEnum: IEnum = js.native
  def getName(): String = js.native
}

object EnumSymbol {
  @scala.inline
  def apply(getName: () => String, parentEnum: IEnum): EnumSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbol]
  }
  @scala.inline
  implicit class EnumSymbolOps[Self <: EnumSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentEnum(value: IEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEnum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

