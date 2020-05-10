package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T] = js.native
}

object BindingOnSyntax {
  @scala.inline
  def apply[T](onActivation: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal(onActivation = js.Any.fromFunction1(onActivation))
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
  @scala.inline
  implicit class BindingOnSyntaxOps[Self[t] <: BindingOnSyntax[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnActivation(value: js.Function2[/* context */ Context, /* injectable */ T, T] => BindingWhenSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

