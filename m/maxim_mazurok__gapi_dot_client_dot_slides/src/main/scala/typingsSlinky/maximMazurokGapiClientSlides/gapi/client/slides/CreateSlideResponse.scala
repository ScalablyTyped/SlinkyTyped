package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSlideResponse extends StObject {
  
  /** The object ID of the created slide. */
  var objectId: js.UndefOr[String] = js.native
}
object CreateSlideResponse {
  
  @scala.inline
  def apply(): CreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideResponse]
  }
  
  @scala.inline
  implicit class CreateSlideResponseMutableBuilder[Self <: CreateSlideResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
