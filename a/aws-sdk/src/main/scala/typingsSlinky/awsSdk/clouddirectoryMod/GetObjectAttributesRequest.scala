package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectAttributesRequest extends StObject {
  
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList = js.native
  
  /**
    * The consistency level at which to retrieve the attributes on an object.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
  
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}
object GetObjectAttributesRequest {
  
  @scala.inline
  def apply(
    AttributeNames: AttributeNameList,
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet
  ): GetObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAttributesRequest]
  }
  
  @scala.inline
  implicit class GetObjectAttributesRequestMutableBuilder[Self <: GetObjectAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesVarargs(value: AttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFacet(value: SchemaFacet): Self = StObject.set(x, "SchemaFacet", value.asInstanceOf[js.Any])
  }
}
