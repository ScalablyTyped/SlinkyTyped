package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLineResponse extends StObject {
  
  /** The object ID of the created line. */
  var objectId: js.UndefOr[String] = js.native
}
object CreateLineResponse {
  
  @scala.inline
  def apply(): CreateLineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLineResponse]
  }
  
  @scala.inline
  implicit class CreateLineResponseMutableBuilder[Self <: CreateLineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
