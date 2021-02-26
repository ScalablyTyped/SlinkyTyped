package typingsSlinky.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponsePayload extends StObject {
  
  /** States of the devices. Map of third-party device ID to struct of device states. */
  var devices: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: {[ P in string ]: any}}
    */ typingsSlinky.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.QueryResponsePayload with TopLevel[js.Any]
  ] = js.native
}
object QueryResponsePayload {
  
  @scala.inline
  def apply(): QueryResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponsePayload]
  }
  
  @scala.inline
  implicit class QueryResponsePayloadMutableBuilder[Self <: QueryResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: {[ P in string ]: any}}
      */ typingsSlinky.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.QueryResponsePayload with TopLevel[js.Any]
    ): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}
