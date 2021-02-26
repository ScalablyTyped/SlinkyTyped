package typingsSlinky.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdAndType extends StObject {
  
  /**
    * The object ID, this can be a URL or a Facebook ID.
    */
  var objectId: String = js.native
  
  /**
    * Encapsulates the valid values for the facebook:object_type
    * attribute for a LikeView
    */
  var objectType: ObjectIdActionType = js.native
}
object ObjectIdAndType {
  
  @scala.inline
  def apply(objectId: String, objectType: ObjectIdActionType): ObjectIdAndType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdAndType]
  }
  
  @scala.inline
  implicit class ObjectIdAndTypeMutableBuilder[Self <: ObjectIdAndType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: ObjectIdActionType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
