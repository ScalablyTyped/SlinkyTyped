package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The period during which some deployable was active in a runtime.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * Address of the runtime element hosting this deployment.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Configuration used to create this deployment.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Beginning of the lifetime of this deployment.
    */
  var deployTime: js.UndefOr[String] = js.native
  /**
    * Platform hosting this deployment.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Output only. Resource URI for the artifact being deployed taken from the
    * deployable field with the same name.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
  /**
    * End of the lifetime of this deployment.
    */
  var undeployTime: js.UndefOr[String] = js.native
  /**
    * Identity of the user that triggered this deployment.
    */
  var userEmail: js.UndefOr[String] = js.native
}

object SchemaDeployment {
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  @scala.inline
  implicit class SchemaDeploymentOps[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUri(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withUndeployTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeployTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndeployTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeployTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(js.undefined)
        ret
    }
  }
  
}

