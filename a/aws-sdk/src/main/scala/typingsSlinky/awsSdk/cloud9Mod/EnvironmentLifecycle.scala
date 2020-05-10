package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentLifecycle extends js.Object {
  /**
    * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
    */
  var failureResource: js.UndefOr[String] = js.native
  /**
    * Any informational message about the lifecycle state of the environment.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The current creation or deletion lifecycle state of the environment.    CREATING: The environment is in the process of being created.    CREATED: The environment was successfully created.    CREATE_FAILED: The environment failed to be created.    DELETING: The environment is in the process of being deleted.    DELETE_FAILED: The environment failed to delete.  
    */
  var status: js.UndefOr[EnvironmentLifecycleStatus] = js.native
}

object EnvironmentLifecycle {
  @scala.inline
  def apply(): EnvironmentLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLifecycle]
  }
  @scala.inline
  implicit class EnvironmentLifecycleOps[Self <: EnvironmentLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureResource")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EnvironmentLifecycleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

