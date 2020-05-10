package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSimulationApplicationVersionRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The current revision id for the simulation application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
}

object CreateSimulationApplicationVersionRequest {
  @scala.inline
  def apply(application: Arn): CreateSimulationApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationVersionRequest]
  }
  @scala.inline
  implicit class CreateSimulationApplicationVersionRequestOps[Self <: CreateSimulationApplicationVersionRequest] (val x: Self) extends AnyVal {
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
    def withCurrentRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevisionId")(js.undefined)
        ret
    }
  }
  
}

