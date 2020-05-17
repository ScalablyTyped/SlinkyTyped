package typingsSlinky.jupyterlabCoreutils.anon

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel[T, U, V /* <: String */] extends js.Object {
  def cancel(last: State[T, U, V]): Boolean = js.native
}

object Cancel {
  @scala.inline
  def apply[T, U, V](cancel: State[T, U, V] => Boolean): Cancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[Cancel[T, U, V]]
  }
  @scala.inline
  implicit class CancelOps[Self[t, u, v] <: Cancel[t, u, v], T, U, V] (val x: Self[T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U, V]) with Other]
    @scala.inline
    def withCancel(value: State[T, U, V] => Boolean): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

