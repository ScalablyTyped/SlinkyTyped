package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingInSyntax[T] extends js.Object {
  def inRequestScope(): BindingWhenOnSyntax[T] = js.native
  def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
  def inTransientScope(): BindingWhenOnSyntax[T] = js.native
}

object BindingInSyntax {
  @scala.inline
  def apply[T](
    inRequestScope: () => BindingWhenOnSyntax[T],
    inSingletonScope: () => BindingWhenOnSyntax[T],
    inTransientScope: () => BindingWhenOnSyntax[T]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal(inRequestScope = js.Any.fromFunction0(inRequestScope), inSingletonScope = js.Any.fromFunction0(inSingletonScope), inTransientScope = js.Any.fromFunction0(inTransientScope))
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
  @scala.inline
  implicit class BindingInSyntaxOps[Self[t] <: BindingInSyntax[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInRequestScope(value: () => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRequestScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInSingletonScope(value: () => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSingletonScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInTransientScope(value: () => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransientScope")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

