package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTagsForDomainRequest extends StObject {
  
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList = js.native
}
object DeleteTagsForDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TagsToDelete = TagsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteTagsForDomainRequestMutableBuilder[Self <: DeleteTagsForDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToDelete(value: TagKeyList): Self = StObject.set(x, "TagsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToDeleteVarargs(value: TagKey*): Self = StObject.set(x, "TagsToDelete", js.Array(value :_*))
  }
}
