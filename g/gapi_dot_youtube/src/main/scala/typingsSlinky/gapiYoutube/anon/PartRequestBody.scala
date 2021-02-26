package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartRequestBody extends StObject {
  
  /**
    * HTTP Request Body
    */
  var RequestBody: String = js.native
  
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and contentDetails.
    */
  var part: String = js.native
}
object PartRequestBody {
  
  @scala.inline
  def apply(RequestBody: String, part: String): PartRequestBody = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartRequestBody]
  }
  
  @scala.inline
  implicit class PartRequestBodyMutableBuilder[Self <: PartRequestBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBody(value: String): Self = StObject.set(x, "RequestBody", value.asInstanceOf[js.Any])
  }
}
