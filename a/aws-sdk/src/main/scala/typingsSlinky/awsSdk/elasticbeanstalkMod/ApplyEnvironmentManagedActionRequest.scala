package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyEnvironmentManagedActionRequest extends js.Object {
  /**
    * The action ID of the scheduled managed action to execute.
    */
  var ActionId: String = js.native
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
}

object ApplyEnvironmentManagedActionRequest {
  @scala.inline
  def apply(ActionId: String): ApplyEnvironmentManagedActionRequest = {
    val __obj = js.Dynamic.literal(ActionId = ActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
  }
  @scala.inline
  implicit class ApplyEnvironmentManagedActionRequestOps[Self <: ApplyEnvironmentManagedActionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
  }
  
}

