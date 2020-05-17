package typingsSlinky.recharts.anon

import typingsSlinky.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAccessor extends js.Object {
  var valueAccessor: RechartsFunction = js.native
}

object ValueAccessor {
  @scala.inline
  def apply(valueAccessor: /* repeated */ js.Any => Unit): ValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = js.Any.fromFunction1(valueAccessor))
    __obj.asInstanceOf[ValueAccessor]
  }
  @scala.inline
  implicit class ValueAccessorOps[Self <: ValueAccessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueAccessor(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAccessor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

