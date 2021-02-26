package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The estimated arrival times for a set of destinations.
  */
@js.native
trait EtaResponse extends StObject {
  
  /**
    * An array of estimated arrival times.
    */
  var etas: js.Array[EtaResult] = js.native
  
  /**
    * The request object associated with the estimated time of arrival response.
    */
  var request: EtaRequestOptions = js.native
}
object EtaResponse {
  
  @scala.inline
  def apply(etas: js.Array[EtaResult], request: EtaRequestOptions): EtaResponse = {
    val __obj = js.Dynamic.literal(etas = etas.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaResponse]
  }
  
  @scala.inline
  implicit class EtaResponseMutableBuilder[Self <: EtaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtas(value: js.Array[EtaResult]): Self = StObject.set(x, "etas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtasVarargs(value: EtaResult*): Self = StObject.set(x, "etas", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: EtaRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
