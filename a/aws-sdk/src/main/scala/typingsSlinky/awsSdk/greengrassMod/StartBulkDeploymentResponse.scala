package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBulkDeploymentResponse extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.native
}

object StartBulkDeploymentResponse {
  @scala.inline
  def apply(): StartBulkDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBulkDeploymentResponse]
  }
  @scala.inline
  implicit class StartBulkDeploymentResponseOps[Self <: StartBulkDeploymentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulkDeploymentArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkDeploymentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBulkDeploymentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentId")(js.undefined)
        ret
    }
  }
  
}

