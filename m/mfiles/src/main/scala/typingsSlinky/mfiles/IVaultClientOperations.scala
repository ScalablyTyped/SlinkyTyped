package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFOfflineTransitionResultFlags
import typingsSlinky.mfiles.MFiles.MFOnlineTransitionResultFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClientOperations extends js.Object {
  def DisableCheckInReminderForCallingProcess(): Unit = js.native
  def EnableCheckInReminderForCallingProcess(): Unit = js.native
  def IsOffline(): Boolean = js.native
  def IsOnline(): Boolean = js.native
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags = js.native
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags = js.native
}

object IVaultClientOperations {
  @scala.inline
  def apply(
    DisableCheckInReminderForCallingProcess: () => Unit,
    EnableCheckInReminderForCallingProcess: () => Unit,
    IsOffline: () => Boolean,
    IsOnline: () => Boolean,
    SetVaultToOffline: Double => MFOfflineTransitionResultFlags,
    SetVaultToOnline: Double => MFOnlineTransitionResultFlags
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = js.Any.fromFunction0(DisableCheckInReminderForCallingProcess), EnableCheckInReminderForCallingProcess = js.Any.fromFunction0(EnableCheckInReminderForCallingProcess), IsOffline = js.Any.fromFunction0(IsOffline), IsOnline = js.Any.fromFunction0(IsOnline), SetVaultToOffline = js.Any.fromFunction1(SetVaultToOffline), SetVaultToOnline = js.Any.fromFunction1(SetVaultToOnline))
    __obj.asInstanceOf[IVaultClientOperations]
  }
  @scala.inline
  implicit class IVaultClientOperationsOps[Self <: IVaultClientOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCheckInReminderForCallingProcess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableCheckInReminderForCallingProcess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableCheckInReminderForCallingProcess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCheckInReminderForCallingProcess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOffline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOffline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOnline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOnline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVaultToOffline(value: Double => MFOfflineTransitionResultFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVaultToOffline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVaultToOnline(value: Double => MFOnlineTransitionResultFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVaultToOnline")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

