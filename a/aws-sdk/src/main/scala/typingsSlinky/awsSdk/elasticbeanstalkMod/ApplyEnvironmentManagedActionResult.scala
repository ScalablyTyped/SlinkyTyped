package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyEnvironmentManagedActionResult extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.native
}

object ApplyEnvironmentManagedActionResult {
  @scala.inline
  def apply(): ApplyEnvironmentManagedActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
  @scala.inline
  implicit class ApplyEnvironmentManagedActionResultOps[Self <: ApplyEnvironmentManagedActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(js.undefined)
        ret
    }
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

