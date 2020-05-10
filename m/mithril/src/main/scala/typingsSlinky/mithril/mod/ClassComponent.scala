package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any class that implements a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
@js.native
trait ClassComponent[A] extends Lifecycle[A, ClassComponent[A]] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  @JSName("onbeforeremove")
  var onbeforeremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], js.Promise[_] | Unit]] = js.native
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  @JSName("onbeforeupdate")
  var onbeforeupdate_ClassComponent: js.UndefOr[
    js.Function2[/* vnode */ Vnode[A, this.type], /* old */ VnodeDOM[A, this.type], Boolean | Unit]
  ] = js.native
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  @JSName("oncreate")
  var oncreate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.native
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  @JSName("oninit")
  var oninit_ClassComponent: js.UndefOr[js.Function1[/* vnode */ Vnode[A, this.type], _]] = js.native
  /** The onremove hook is called before a DOM element is removed from the document. */
  @JSName("onremove")
  var onremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.native
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  @JSName("onupdate")
  var onupdate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.native
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[A, this.type]): Children | Null | Unit = js.native
}

object ClassComponent {
  @scala.inline
  def apply[A](view: Vnode[A, ClassComponent[A]] => Children | Null | Unit): ClassComponent[A] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[ClassComponent[A]]
  }
  @scala.inline
  implicit class ClassComponentOps[Self[a] <: ClassComponent[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withView(value: Vnode[A, ClassComponent[A]] => Children | Null | Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnbeforeremove(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => js.Promise[_] | Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnbeforeremove: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforeupdate(
      value: (/* vnode */ Vnode[A, ClassComponent[A]], /* old */ VnodeDOM[A, ClassComponent[A]]) => Boolean | Unit
    ): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeupdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnbeforeupdate: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeupdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOncreate(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => _): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOncreate: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOninit(value: /* vnode */ Vnode[A, ClassComponent[A]] => _): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOninit: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnremove(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => _): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnremove: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnupdate(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => _): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnupdate: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(js.undefined)
        ret
    }
  }
  
}

