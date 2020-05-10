package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultCoreEvents extends IEvents {
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, Unit | IVaultEntryEvents]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IVaultCoreEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IVaultCoreEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IVaultCoreEvents]
  }
  @scala.inline
  implicit class IVaultCoreEventsOps[Self <: IVaultCoreEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNewVaultEntry(value: /* vaultEntry */ IVaultEntry => Unit | IVaultEntryEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewVaultEntry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewVaultEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewVaultEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.undefined)
        ret
    }
  }
  
}

