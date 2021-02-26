package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPublicAccess extends StObject {
  
  /**
    *  Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to the bucket. Possible values are: NOT_PUBLIC - The bucket isn't publicly accessible. PUBLIC - The bucket is publicly accessible. UNKNOWN - Amazon Macie can't determine whether the bucket is publicly accessible.
    */
  var effectivePermission: js.UndefOr[EffectivePermission] = js.native
  
  /**
    * The account-level and bucket-level permissions for the bucket.
    */
  var permissionConfiguration: js.UndefOr[BucketPermissionConfiguration] = js.native
}
object BucketPublicAccess {
  
  @scala.inline
  def apply(): BucketPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPublicAccess]
  }
  
  @scala.inline
  implicit class BucketPublicAccessMutableBuilder[Self <: BucketPublicAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectivePermission(value: EffectivePermission): Self = StObject.set(x, "effectivePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePermissionUndefined: Self = StObject.set(x, "effectivePermission", js.undefined)
    
    @scala.inline
    def setPermissionConfiguration(value: BucketPermissionConfiguration): Self = StObject.set(x, "permissionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionConfigurationUndefined: Self = StObject.set(x, "permissionConfiguration", js.undefined)
  }
}
