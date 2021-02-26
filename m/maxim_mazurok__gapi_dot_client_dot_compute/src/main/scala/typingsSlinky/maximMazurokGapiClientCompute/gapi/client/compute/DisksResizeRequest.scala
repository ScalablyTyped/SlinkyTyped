package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisksResizeRequest extends StObject {
  
  /** The new size of the persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.native
}
object DisksResizeRequest {
  
  @scala.inline
  def apply(): DisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksResizeRequest]
  }
  
  @scala.inline
  implicit class DisksResizeRequestMutableBuilder[Self <: DisksResizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
