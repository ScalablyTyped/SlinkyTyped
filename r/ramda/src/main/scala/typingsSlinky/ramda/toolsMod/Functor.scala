package typingsSlinky.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functor[A] extends js.Object {
  def map[U](fn: js.Function1[/* a */ A, U]): Functor[U] = js.native
}

object Functor {
  @scala.inline
  def apply[A](map: js.Function1[/* a */ A, js.Any] => Functor[js.Any]): Functor[A] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Functor[A]]
  }
  @scala.inline
  implicit class FunctorOps[Self[a] <: Functor[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withMap(value: js.Function1[/* a */ A, js.Any] => Functor[js.Any]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

