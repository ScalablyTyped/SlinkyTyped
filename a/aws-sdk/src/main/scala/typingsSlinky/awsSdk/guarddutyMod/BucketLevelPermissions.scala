package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLevelPermissions extends StObject {
  
  /**
    * Contains information on how Access Control Policies are applied to the bucket.
    */
  var AccessControlList: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.AccessControlList] = js.native
  
  /**
    * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
    */
  var BlockPublicAccess: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.BlockPublicAccess] = js.native
  
  /**
    * Contains information on the bucket policies for the S3 bucket.
    */
  var BucketPolicy: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.BucketPolicy] = js.native
}
object BucketLevelPermissions {
  
  @scala.inline
  def apply(): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevelPermissions]
  }
  
  @scala.inline
  implicit class BucketLevelPermissionsMutableBuilder[Self <: BucketLevelPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: AccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    @scala.inline
    def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "BlockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAccessUndefined: Self = StObject.set(x, "BlockPublicAccess", js.undefined)
    
    @scala.inline
    def setBucketPolicy(value: BucketPolicy): Self = StObject.set(x, "BucketPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPolicyUndefined: Self = StObject.set(x, "BucketPolicy", js.undefined)
  }
}
