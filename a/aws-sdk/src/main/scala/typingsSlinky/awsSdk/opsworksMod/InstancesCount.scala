package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesCount extends js.Object {
  /**
    * The number of instances in the Assigning state.
    */
  var Assigning: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with booting status.
    */
  var Booting: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with connection_lost status.
    */
  var ConnectionLost: js.UndefOr[Integer] = js.native
  /**
    * The number of instances in the Deregistering state.
    */
  var Deregistering: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with online status.
    */
  var Online: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with pending status.
    */
  var Pending: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with rebooting status.
    */
  var Rebooting: js.UndefOr[Integer] = js.native
  /**
    * The number of instances in the Registered state.
    */
  var Registered: js.UndefOr[Integer] = js.native
  /**
    * The number of instances in the Registering state.
    */
  var Registering: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with requested status.
    */
  var Requested: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with running_setup status.
    */
  var RunningSetup: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with setup_failed status.
    */
  var SetupFailed: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with shutting_down status.
    */
  var ShuttingDown: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with start_failed status.
    */
  var StartFailed: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with stop_failed status.
    */
  var StopFailed: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with stopped status.
    */
  var Stopped: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with stopping status.
    */
  var Stopping: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with terminated status.
    */
  var Terminated: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with terminating status.
    */
  var Terminating: js.UndefOr[Integer] = js.native
  /**
    * The number of instances in the Unassigning state.
    */
  var Unassigning: js.UndefOr[Integer] = js.native
}

object InstancesCount {
  @scala.inline
  def apply(): InstancesCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCount]
  }
  @scala.inline
  implicit class InstancesCountOps[Self <: InstancesCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigning(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assigning")(js.undefined)
        ret
    }
    @scala.inline
    def withBooting(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Booting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Booting")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionLost(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionLost")(js.undefined)
        ret
    }
    @scala.inline
    def withDeregistering(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deregistering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeregistering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deregistering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnline(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Online")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.undefined)
        ret
    }
    @scala.inline
    def withRebooting(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rebooting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebooting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rebooting")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistered(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registered")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistering(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registering")(js.undefined)
        ret
    }
    @scala.inline
    def withRequested(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requested")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningSetup(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupFailed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetupFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetupFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withShuttingDown(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShuttingDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuttingDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShuttingDown")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFailed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withStopFailed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopped")(js.undefined)
        ret
    }
    @scala.inline
    def withStopping(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopping")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminated(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminated")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminating(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminating")(js.undefined)
        ret
    }
    @scala.inline
    def withUnassigning(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unassigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnassigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unassigning")(js.undefined)
        ret
    }
  }
  
}

