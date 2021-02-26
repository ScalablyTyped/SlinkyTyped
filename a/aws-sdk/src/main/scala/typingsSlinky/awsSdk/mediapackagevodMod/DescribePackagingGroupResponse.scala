package typingsSlinky.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagingGroupResponse extends StObject {
  
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[string] = js.native
  
  var Authorization: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.Authorization] = js.native
  
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[string] = js.native
  
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[string] = js.native
  
  var Tags: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.Tags] = js.native
}
object DescribePackagingGroupResponse {
  
  @scala.inline
  def apply(): DescribePackagingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagingGroupResponse]
  }
  
  @scala.inline
  implicit class DescribePackagingGroupResponseMutableBuilder[Self <: DescribePackagingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
