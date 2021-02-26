package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  /**
    * The details object provides additional details specific to the error, giving more information about why the error was raised.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#details)
    */
  var details: js.Any = js.native
  
  /**
    * A message describing the details of the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#message)
    */
  var message: String = js.native
  
  /**
    * A unique error name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#name)
    */
  var name: String = js.native
}
object Error {
  
  @scala.inline
  def apply(details: js.Any, message: String, name: String): Error = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
