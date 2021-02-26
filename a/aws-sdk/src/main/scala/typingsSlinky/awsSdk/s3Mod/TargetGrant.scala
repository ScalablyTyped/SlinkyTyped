package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGrant extends StObject {
  
  /**
    * Container for the person being granted permissions.
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Grantee] = js.native
  
  /**
    * Logging permissions assigned to the grantee for the bucket.
    */
  var Permission: js.UndefOr[BucketLogsPermission] = js.native
}
object TargetGrant {
  
  @scala.inline
  def apply(): TargetGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGrant]
  }
  
  @scala.inline
  implicit class TargetGrantMutableBuilder[Self <: TargetGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    @scala.inline
    def setPermission(value: BucketLogsPermission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
