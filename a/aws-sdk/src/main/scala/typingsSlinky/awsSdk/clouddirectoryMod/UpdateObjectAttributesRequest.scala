package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateObjectAttributesRequest extends StObject {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object UpdateObjectAttributesRequest {
  
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, DirectoryArn: Arn, ObjectReference: ObjectReference): UpdateObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObjectAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateObjectAttributesRequestMutableBuilder[Self <: UpdateObjectAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeUpdates(value: ObjectAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUpdatesVarargs(value: ObjectAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value :_*))
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
