package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAlertpoliciesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required if the policy exists. The resource name for this policy. The
    * syntax is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
    * [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy
    * is created. When calling the alertPolicies.create method, do not include
    * the name field in the alerting policy passed as part of the request.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAlertPolicy] = js.native
  
  /**
    * Optional. A list of alerting policy field names. If this field is not
    * empty, each listed field in the existing alerting policy is set to the
    * value of the corresponding field in the supplied policy (alert_policy),
    * or to the field's default value if the field is not in the supplied
    * alerting policy. Fields not listed retain their previous value.Examples
    * of valid field masks include display_name, documentation,
    * documentation.content, documentation.mime_type, user_labels,
    * user_label.nameofkey, enabled, conditions, combiner, etc.If this field is
    * empty, then the supplied alerting policy replaces the existing policy. It
    * is the same as deleting the existing policy and adding the supplied
    * policy, except for the following: The new policy will have the same
    * [ALERT_POLICY_ID] as the former policy. This gives you continuity with
    * the former policy in your notifications and incidents. Conditions in the
    * new policy will keep their former [CONDITION_ID] if the supplied
    * condition includes the name field with that [CONDITION_ID]. If the
    * supplied condition omits the name field, then a new [CONDITION_ID] is
    * created.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsAlertpoliciesPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAlertpoliciesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAlertpoliciesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAlertpoliciesPatchOps[Self <: ParamsResourceProjectsAlertpoliciesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAlertPolicy): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
