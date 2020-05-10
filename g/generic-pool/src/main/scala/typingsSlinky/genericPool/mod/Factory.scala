package typingsSlinky.genericPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[Boolean]]] = js.native
  def create(): js.Thenable[T] = js.native
  def destroy(client: T): js.Thenable[Unit] = js.native
}

object Factory {
  @scala.inline
  def apply[T](create: () => js.Thenable[T], destroy: T => js.Thenable[Unit]): Factory[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[Factory[T]]
  }
  @scala.inline
  implicit class FactoryOps[Self[t] <: Factory[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCreate(value: () => js.Thenable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: T => js.Thenable[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: /* client */ T => js.Thenable[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

