package typingsSlinky.javascriptObfuscator.ivisitorMod

import org.scalajs.dom.raw.Node
import typingsSlinky.estraverse.mod.VisitorOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVisitor[T /* <: Node */] extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.native
  var leave: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.native
}

object IVisitor {
  @scala.inline
  def apply[T](): IVisitor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVisitor[T]]
  }
  @scala.inline
  implicit class IVisitorOps[Self[t] <: IVisitor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEnter(value: (/* node */ T, /* parentNode */ Node | Null) => Node | VisitorOption | Unit): Self[T] = {
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
    def withLeave(value: (/* node */ T, /* parentNode */ Node | Null) => Node | VisitorOption | Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
  }
  
}

