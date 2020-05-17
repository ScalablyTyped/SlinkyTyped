package typingsSlinky.mithril.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mithril.mod.Vnode
import typingsSlinky.mithril.mod.VnodeDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mithril.mithril.Lifecycle<any, any> & {[key: string] : any} */
@js.native
trait Lifecycleanyanykeystringa
  extends /* key */ StringDictionary[js.Any]
     with /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
/* _ */ NumberDictionary[js.Any] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]
  ] = js.native
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
  ] = js.native
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]] = js.native
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
}

object Lifecycleanyanykeystringa {
  @scala.inline
  def apply(): Lifecycleanyanykeystringa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycleanyanykeystringa]
  }
  @scala.inline
  implicit class LifecycleanyanykeystringaOps[Self <: Lifecycleanyanykeystringa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnbeforeremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeremove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforeremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbeforeupdate(
      value: js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnbeforeupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeforeupdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOncreate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOninit(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnupdate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(js.undefined)
        ret
    }
  }
  
}

