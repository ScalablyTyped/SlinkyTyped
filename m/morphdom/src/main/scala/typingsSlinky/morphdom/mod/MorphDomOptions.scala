package typingsSlinky.morphdom.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphDomOptions extends js.Object {
  var childrenOnly: js.UndefOr[Boolean] = js.native
  var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.native
  var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
  var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
  var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
  var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.native
  var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
  var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object MorphDomOptions {
  @scala.inline
  def apply(): MorphDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MorphDomOptions]
  }
  @scala.inline
  implicit class MorphDomOptionsOps[Self <: MorphDomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeKey(value: /* node */ Node => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNodeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeElChildrenUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeElChildrenUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeElChildrenUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeElChildrenUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeElUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeElUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeElUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeElUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeNodeAdded(value: /* node */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNodeAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeNodeAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNodeAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeNodeDiscarded(value: /* node */ Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNodeDiscarded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeNodeDiscarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNodeDiscarded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnElUpdated(value: /* el */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnElUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeAdded(value: /* node */ Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeDiscarded(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDiscarded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeDiscarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDiscarded")(js.undefined)
        ret
    }
  }
  
}

