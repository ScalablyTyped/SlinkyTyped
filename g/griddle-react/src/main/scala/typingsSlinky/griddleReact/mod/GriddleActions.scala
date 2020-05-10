package typingsSlinky.griddleReact.mod

import typingsSlinky.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleActions
  extends PropertyBag[js.UndefOr[ActionCreator[js.Any]]] {
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, Unit]] = js.native
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.native
}

object GriddleActions {
  @scala.inline
  def apply(): GriddleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleActions]
  }
  @scala.inline
  implicit class GriddleActionsOps[Self <: GriddleActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGetPage(value: /* pageNumber */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: /* sortProperties */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilter(value: /* filter */ GriddleFilter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilter")(js.undefined)
        ret
    }
  }
  
}

