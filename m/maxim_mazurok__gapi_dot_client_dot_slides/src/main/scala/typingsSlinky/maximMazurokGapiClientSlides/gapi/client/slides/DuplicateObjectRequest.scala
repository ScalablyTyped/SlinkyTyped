package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateObjectRequest extends StObject {
  
  /** The ID of the object to duplicate. */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The object being duplicated may contain other objects, for example when duplicating a slide or a group page element. This map defines how the IDs of duplicated objects are
    * generated: the keys are the IDs of the original objects and its values are the IDs that will be assigned to the corresponding duplicate object. The ID of the source object's
    * duplicate may be specified in this map as well, using the same value of the `object_id` field as a key and the newly desired ID as the value. All keys must correspond to existing
    * IDs in the presentation. All values must be unique in the presentation and must start with an alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining
    * characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the new ID must not be less than 5 or greater than 50. If any IDs of source
    * objects are omitted from the map, a new random ID will be assigned. If the map is empty or unset, all duplicate objects will receive a new random ID.
    */
  var objectIds: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.DuplicateObjectRequest with TopLevel[js.Any]
  ] = js.native
}
object DuplicateObjectRequest {
  
  @scala.inline
  def apply(): DuplicateObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectRequest]
  }
  
  @scala.inline
  implicit class DuplicateObjectRequestMutableBuilder[Self <: DuplicateObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setObjectIds(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.DuplicateObjectRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
  }
}
