package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchDeployment extends StObject {
  
  /** Output only. Time the patch deployment was created. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Description of the patch deployment. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Duration of the patch. After the duration ends, the patch times out. */
  var duration: js.UndefOr[String] = js.native
  
  /** Required. VM instances to patch. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.native
  
  /** Output only. The last time a patch job was started by this deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var lastExecuteTime: js.UndefOr[String] = js.native
  
  /**
    * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is
    * ignored when you create a new patch deployment.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Schedule a one-time execution. */
  var oneTimeSchedule: js.UndefOr[OneTimeSchedule] = js.native
  
  /** Optional. Patch configuration that is applied. */
  var patchConfig: js.UndefOr[PatchConfig] = js.native
  
  /** Required. Schedule recurring executions. */
  var recurringSchedule: js.UndefOr[RecurringSchedule] = js.native
  
  /** Optional. Rollout strategy of the patch job. */
  var rollout: js.UndefOr[PatchRollout] = js.native
  
  /** Output only. Time the patch deployment was last updated. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var updateTime: js.UndefOr[String] = js.native
}
object PatchDeployment {
  
  @scala.inline
  def apply(): PatchDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchDeployment]
  }
  
  @scala.inline
  implicit class PatchDeploymentMutableBuilder[Self <: PatchDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setInstanceFilter(value: PatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    @scala.inline
    def setLastExecuteTime(value: String): Self = StObject.set(x, "lastExecuteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecuteTimeUndefined: Self = StObject.set(x, "lastExecuteTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOneTimeSchedule(value: OneTimeSchedule): Self = StObject.set(x, "oneTimeSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneTimeScheduleUndefined: Self = StObject.set(x, "oneTimeSchedule", js.undefined)
    
    @scala.inline
    def setPatchConfig(value: PatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    @scala.inline
    def setRecurringSchedule(value: RecurringSchedule): Self = StObject.set(x, "recurringSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringScheduleUndefined: Self = StObject.set(x, "recurringSchedule", js.undefined)
    
    @scala.inline
    def setRollout(value: PatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
