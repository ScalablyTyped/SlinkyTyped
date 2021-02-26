package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EFSAuthorizationConfig extends StObject {
  
  /**
    * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the EFSVolumeConfiguration must either be omitted or set to / which will enforce the path set on the EFS access point. If an access point is used, transit encryption must be enabled in the EFSVolumeConfiguration. For more information, see Working with Amazon EFS Access Points in the Amazon Elastic File System User Guide.
    */
  var accessPointId: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. If this parameter is omitted, the default value of DISABLED is used. For more information, see Using Amazon EFS Access Points in the Amazon Elastic Container Service Developer Guide.
    */
  var iam: js.UndefOr[EFSAuthorizationConfigIAM] = js.native
}
object EFSAuthorizationConfig {
  
  @scala.inline
  def apply(): EFSAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EFSAuthorizationConfig]
  }
  
  @scala.inline
  implicit class EFSAuthorizationConfigMutableBuilder[Self <: EFSAuthorizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointIdUndefined: Self = StObject.set(x, "accessPointId", js.undefined)
    
    @scala.inline
    def setIam(value: EFSAuthorizationConfigIAM): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
  }
}
