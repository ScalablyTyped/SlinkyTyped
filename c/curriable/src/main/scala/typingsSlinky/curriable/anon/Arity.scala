package typingsSlinky.curriable.anon

import typingsSlinky.curriable.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arity[Fn /* <: Handler */] extends js.Object {
  var arity: Double = js.native
  var fn: Fn = js.native
}

object Arity {
  @scala.inline
  def apply[Fn](arity: Double, fn: Fn): Arity[Fn] = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arity[Fn]]
  }
  @scala.inline
  implicit class ArityOps[Self[fn] <: Arity[fn], Fn] (val x: Self[Fn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Fn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Fn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Fn] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Fn] with Other]
    @scala.inline
    def withArity(value: Double): Self[Fn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: Fn): Self[Fn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

