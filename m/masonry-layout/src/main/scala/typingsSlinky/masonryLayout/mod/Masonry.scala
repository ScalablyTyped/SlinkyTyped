package typingsSlinky.masonryLayout.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Masonry extends js.Object {
  var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  // add and remove items
  var appended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var data: js.UndefOr[js.Function1[/* element */ Element, this.type]] = js.native
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  var getItemElements: js.UndefOr[js.Function0[js.Array[_]]] = js.native
  // layout
  var layout: js.UndefOr[js.Function0[Unit]] = js.native
  var layoutItems: js.UndefOr[js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean], Unit]] = js.native
  var masonry: js.UndefOr[
    js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit])
  ] = js.native
  var off: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  // events
  var on: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  var once: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  // utilities
  var reloadItems: js.UndefOr[js.Function0[Unit]] = js.native
  var remove: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
}

object Masonry {
  @scala.inline
  def apply(): Masonry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Masonry]
  }
  @scala.inline
  implicit class MasonryOps[Self <: Masonry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddItems(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAppended(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appended")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appended")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: /* element */ Element => Masonry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemElements(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemElements")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutItems(value: (/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLayoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMasonry(value: js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasonry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(js.undefined)
        ret
    }
    @scala.inline
    def withOff(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepended(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepended")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepended")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReloadItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withStamp(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstamp(value: /* elements */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstamp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnstamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstamp")(js.undefined)
        ret
    }
  }
  
}

