package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportRequest extends StObject {
  
  /**
    * Specifies the action that the StartImport operation should take when there is an existing resource with the same name.   FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file and an existing resource. The name of the resource causing the conflict is in the failureReason field of the response to the GetImport operation. OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The $LASTEST version of the existing resource is overwritten with the data from the import file.  
    */
  var mergeStrategy: MergeStrategy = js.native
  
  /**
    * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to import. The resource should match the type specified in the resourceType field.
    */
  var payload: _Blob = js.native
  
  /**
    * Specifies the type of resource to export. Each resource also exports any resources that it depends on.    A bot exports dependent intents.   An intent exports dependent slot types.  
    */
  var resourceType: ResourceType = js.native
  
  /**
    * A list of tags to add to the imported bot. You can only add tags when you import a bot, you can't add tags to an intent or slot type.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object StartImportRequest {
  
  @scala.inline
  def apply(mergeStrategy: MergeStrategy, payload: _Blob, resourceType: ResourceType): StartImportRequest = {
    val __obj = js.Dynamic.literal(mergeStrategy = mergeStrategy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportRequest]
  }
  
  @scala.inline
  implicit class StartImportRequestMutableBuilder[Self <: StartImportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: _Blob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
