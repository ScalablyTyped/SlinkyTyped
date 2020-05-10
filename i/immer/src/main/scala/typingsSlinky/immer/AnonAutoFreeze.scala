package typingsSlinky.immer

import typingsSlinky.immer.mod.ImmerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoFreeze extends js.Object {
  var autoFreeze: js.UndefOr[Boolean] = js.native
  var onAssign: js.UndefOr[
    js.Function3[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any, Unit]
  ] = js.native
  var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[_], Unit]] = js.native
  var onDelete: js.UndefOr[js.Function2[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, Unit]] = js.native
  var useProxies: js.UndefOr[Boolean] = js.native
}

object AnonAutoFreeze {
  @scala.inline
  def apply(): AnonAutoFreeze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoFreeze]
  }
  @scala.inline
  implicit class AnonAutoFreezeOps[Self <: AnonAutoFreeze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFreeze(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFreeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFreeze: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFreeze")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAssign(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssign")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssign")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: /* state */ ImmerState[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDelete(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withUseProxies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseProxies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxies")(js.undefined)
        ret
    }
  }
  
}

