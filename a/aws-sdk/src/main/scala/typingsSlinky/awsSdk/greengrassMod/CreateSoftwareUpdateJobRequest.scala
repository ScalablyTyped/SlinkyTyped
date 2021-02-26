package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSoftwareUpdateJobRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  
  var S3UrlSignerRole: typingsSlinky.awsSdk.greengrassMod.S3UrlSignerRole = js.native
  
  var SoftwareToUpdate: typingsSlinky.awsSdk.greengrassMod.SoftwareToUpdate = js.native
  
  var UpdateAgentLogLevel: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.UpdateAgentLogLevel] = js.native
  
  var UpdateTargets: typingsSlinky.awsSdk.greengrassMod.UpdateTargets = js.native
  
  var UpdateTargetsArchitecture: typingsSlinky.awsSdk.greengrassMod.UpdateTargetsArchitecture = js.native
  
  var UpdateTargetsOperatingSystem: typingsSlinky.awsSdk.greengrassMod.UpdateTargetsOperatingSystem = js.native
}
object CreateSoftwareUpdateJobRequest {
  
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
  
  @scala.inline
  implicit class CreateSoftwareUpdateJobRequestMutableBuilder[Self <: CreateSoftwareUpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setS3UrlSignerRole(value: S3UrlSignerRole): Self = StObject.set(x, "S3UrlSignerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareToUpdate(value: SoftwareToUpdate): Self = StObject.set(x, "SoftwareToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAgentLogLevel(value: UpdateAgentLogLevel): Self = StObject.set(x, "UpdateAgentLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAgentLogLevelUndefined: Self = StObject.set(x, "UpdateAgentLogLevel", js.undefined)
    
    @scala.inline
    def setUpdateTargets(value: UpdateTargets): Self = StObject.set(x, "UpdateTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsArchitecture(value: UpdateTargetsArchitecture): Self = StObject.set(x, "UpdateTargetsArchitecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsOperatingSystem(value: UpdateTargetsOperatingSystem): Self = StObject.set(x, "UpdateTargetsOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsVarargs(value: string*): Self = StObject.set(x, "UpdateTargets", js.Array(value :_*))
  }
}
