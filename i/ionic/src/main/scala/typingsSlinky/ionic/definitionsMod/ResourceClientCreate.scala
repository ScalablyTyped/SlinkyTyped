package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  def create(details: U): js.Promise[T] = js.native
}

object ResourceClientCreate {
  @scala.inline
  def apply[T, U](create: U => js.Promise[T]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
  @scala.inline
  implicit class ResourceClientCreateOps[Self[t, u] <: ResourceClientCreate[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCreate(value: U => js.Promise[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

