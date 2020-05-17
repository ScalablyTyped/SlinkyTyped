package typingsSlinky.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitNodeObject[T]
  extends VisitNode[T, js.Any] {
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.native
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.native
}

object VisitNodeObject {
  @scala.inline
  def apply[T](): VisitNodeObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitNodeObject[T]]
  }
  @scala.inline
  implicit class VisitNodeObjectOps[Self[t] <: VisitNodeObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEnter(value: (/* path */ NodePath[T], /* state */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: (/* path */ NodePath[T], /* state */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
  }
  
}

