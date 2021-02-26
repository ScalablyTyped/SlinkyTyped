package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationResponse extends StObject {
  
  /**
    * When the status code is other than `OK`, there may be an additional `error_message` field within the Elevation response object.
    * This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  
  /** An Elevation results array. */
  var results: js.Array[ElevationResult] = js.native
  
  /** An Elevation status code. */
  var status: ElevationResponseStatus = js.native
}
object ElevationResponse {
  
  @scala.inline
  def apply(error_message: String, results: js.Array[ElevationResult], status: ElevationResponseStatus): ElevationResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResponse]
  }
  
  @scala.inline
  implicit class ElevationResponseMutableBuilder[Self <: ElevationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[ElevationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: ElevationResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ElevationResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
