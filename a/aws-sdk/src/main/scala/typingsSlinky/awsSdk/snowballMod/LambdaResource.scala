package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaResource extends js.Object {
  /**
    * The array of ARNs for S3Resource objects to trigger the LambdaResource objects associated with this job.
    */
  var EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.native
  /**
    * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the associated local Amazon S3 resource.
    */
  var LambdaArn: js.UndefOr[ResourceARN] = js.native
}

object LambdaResource {
  @scala.inline
  def apply(): LambdaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaResource]
  }
  @scala.inline
  implicit class LambdaResourceOps[Self <: LambdaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTriggers(value: EventTriggerDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaArn(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaArn")(js.undefined)
        ret
    }
  }
  
}

