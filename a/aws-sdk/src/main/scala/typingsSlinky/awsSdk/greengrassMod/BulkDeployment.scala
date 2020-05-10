package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeployment extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.native
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
}

object BulkDeployment {
  @scala.inline
  def apply(): BulkDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeployment]
  }
  @scala.inline
  implicit class BulkDeploymentOps[Self <: BulkDeployment] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withCreatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
  }
  
}

