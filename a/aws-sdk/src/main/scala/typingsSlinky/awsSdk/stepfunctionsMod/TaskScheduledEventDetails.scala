package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskScheduledEventDetails extends js.Object {
  /**
    * The JSON data passed to the resource referenced in a task state.
    */
  var parameters: ConnectorParameters = js.native
  /**
    * The region of the scheduled task
    */
  var region: Name = js.native
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
  /**
    * The maximum allowed duration of the task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object TaskScheduledEventDetails {
  @scala.inline
  def apply(parameters: ConnectorParameters, region: Name, resource: Name, resourceType: Name): TaskScheduledEventDetails = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskScheduledEventDetails]
  }
  @scala.inline
  implicit class TaskScheduledEventDetailsOps[Self <: TaskScheduledEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: ConnectorParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: TimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

