package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFacetToObjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * Attributes on the facet that you are adding to the object.
    */
  var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.native
  
  /**
    * A reference to the object you are adding the specified facet to.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  
  /**
    * Identifiers for the facet that you are adding to the object. See SchemaFacet for details.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}
object AddFacetToObjectRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): AddFacetToObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFacetToObjectRequest]
  }
  
  @scala.inline
  implicit class AddFacetToObjectRequestMutableBuilder[Self <: AddFacetToObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAttributeList(value: AttributeKeyAndValueList): Self = StObject.set(x, "ObjectAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAttributeListUndefined: Self = StObject.set(x, "ObjectAttributeList", js.undefined)
    
    @scala.inline
    def setObjectAttributeListVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "ObjectAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
