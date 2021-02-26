package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new shape.
  */
@js.native
trait SchemaCreateShapeRequest extends StObject {
  
  /**
    * The element properties for the shape.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50. If empty, a unique identifier
    * will be generated.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The shape type.
    */
  var shapeType: js.UndefOr[String] = js.native
}
object SchemaCreateShapeRequest {
  
  @scala.inline
  def apply(): SchemaCreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShapeRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateShapeRequestMutableBuilder[Self <: SchemaCreateShapeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementProperties(value: SchemaPageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
  }
}
