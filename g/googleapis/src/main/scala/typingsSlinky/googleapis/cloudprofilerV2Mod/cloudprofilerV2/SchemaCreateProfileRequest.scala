package typingsSlinky.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreateProfileRequest describes a profile resource online creation request.
  * The deployment field must be populated. The profile_type specifies the list
  * of profile types supported by the agent. The creation call will hang until
  * a profile of one of these types needs to be collected.
  */
@js.native
trait SchemaCreateProfileRequest extends js.Object {
  /**
    * Deployment details.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * One or more profile types that the agent is capable of providing.
    */
  var profileType: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreateProfileRequest {
  @scala.inline
  def apply(): SchemaCreateProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateProfileRequest]
  }
  @scala.inline
  implicit class SchemaCreateProfileRequestOps[Self <: SchemaCreateProfileRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withProfileType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(js.undefined)
        ret
    }
  }
  
}

