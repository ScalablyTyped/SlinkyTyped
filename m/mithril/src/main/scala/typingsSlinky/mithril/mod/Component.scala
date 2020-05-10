package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any Javascript object that has a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
@js.native
trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */]
  extends Lifecycle[Attrs, State]
     with _ComponentTypes[Attrs, State] {
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[Attrs, State]): Children | Null | Unit = js.native
}

object Component {
  @scala.inline
  def apply[Attrs, State](view: Vnode[Attrs, State] => Children | Null | Unit): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[Component[Attrs, State]]
  }
  @scala.inline
  implicit class ComponentOps[Self[attrs, state] <: Component[attrs, state], Attrs, State] (val x: Self[Attrs, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Attrs, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Attrs, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Attrs, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Attrs, State]) with Other]
    @scala.inline
    def withView(value: Vnode[Attrs, State] => Children | Null | Unit): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

