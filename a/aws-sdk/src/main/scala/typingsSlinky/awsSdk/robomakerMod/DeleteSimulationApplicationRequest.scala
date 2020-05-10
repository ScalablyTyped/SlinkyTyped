package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application to delete.
    */
  var application: Arn = js.native
  /**
    * The version of the simulation application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DeleteSimulationApplicationRequest {
  @scala.inline
  def apply(application: Arn): DeleteSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSimulationApplicationRequest]
  }
  @scala.inline
  implicit class DeleteSimulationApplicationRequestOps[Self <: DeleteSimulationApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(js.undefined)
        ret
    }
  }
  
}

