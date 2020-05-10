package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactProviderType[T] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double = js.native
  var _context: ReactContext[T] = js.native
}

object ReactProviderType {
  @scala.inline
  def apply[T](DollarDollartypeof: js.Symbol | Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactProviderType[T]]
  }
  @scala.inline
  implicit class ReactProviderTypeOps[Self[t] <: ReactProviderType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDollarDollartypeof(value: js.Symbol | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: ReactContext[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

