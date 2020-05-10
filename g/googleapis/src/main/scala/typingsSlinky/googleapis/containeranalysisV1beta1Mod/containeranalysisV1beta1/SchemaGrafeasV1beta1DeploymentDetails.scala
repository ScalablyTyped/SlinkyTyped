package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a deployment occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1DeploymentDetails extends js.Object {
  /**
    * Required. Deployment history for the resource.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
}

object SchemaGrafeasV1beta1DeploymentDetails {
  @scala.inline
  def apply(): SchemaGrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1DeploymentDetails]
  }
  @scala.inline
  implicit class SchemaGrafeasV1beta1DeploymentDetailsOps[Self <: SchemaGrafeasV1beta1DeploymentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: SchemaDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(js.undefined)
        ret
    }
  }
  
}

