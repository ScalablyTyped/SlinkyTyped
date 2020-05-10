package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request with deployment information to update an existing deployment.
  */
@js.native
trait SchemaUpdateDeploymentRequest extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.native
}

object SchemaUpdateDeploymentRequest {
  @scala.inline
  def apply(): SchemaUpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeploymentRequest]
  }
  @scala.inline
  implicit class SchemaUpdateDeploymentRequestOps[Self <: SchemaUpdateDeploymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentConfig(value: SchemaDeploymentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(js.undefined)
        ret
    }
  }
  
}

