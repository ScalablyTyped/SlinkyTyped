package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateData extends StObject {
  
  var referenceId: js.UndefOr[String] = js.native
  
  var referencePayload: js.UndefOr[String] = js.native
}
object PrivateData {
  
  @scala.inline
  def apply(): PrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateData]
  }
  
  @scala.inline
  implicit class PrivateDataMutableBuilder[Self <: PrivateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
    
    @scala.inline
    def setReferencePayload(value: String): Self = StObject.set(x, "referencePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePayloadUndefined: Self = StObject.set(x, "referencePayload", js.undefined)
  }
}
