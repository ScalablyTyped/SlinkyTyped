package typingsSlinky.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of a resource to which you want to apply tags. For example, arn:aws:opsworks-cm:us-west-2:123456789012:server/test-owcm-server/EXAMPLE-66b0-4196-8274-d1a2bEXAMPLE.
    */
  var ResourceArn: AWSOpsWorksCMResourceArn = js.native
  
  /**
    * A map that contains tag keys and tag values to attach to AWS OpsWorks-CM servers or backups.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM server or backup.  
    */
  var Tags: TagList = js.native
}
object TagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: AWSOpsWorksCMResourceArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AWSOpsWorksCMResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
