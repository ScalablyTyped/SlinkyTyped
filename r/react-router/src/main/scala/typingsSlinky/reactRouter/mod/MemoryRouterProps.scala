package typingsSlinky.reactRouter.mod

import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.native
  var initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var keyLength: js.UndefOr[Double] = js.native
}

object MemoryRouterProps {
  @scala.inline
  def apply(): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryRouterProps]
  }
  @scala.inline
  implicit class MemoryRouterPropsOps[Self <: MemoryRouterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetUserConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialEntries(value: js.Array[LocationDescriptor[LocationState]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(js.undefined)
        ret
    }
  }
  
}

