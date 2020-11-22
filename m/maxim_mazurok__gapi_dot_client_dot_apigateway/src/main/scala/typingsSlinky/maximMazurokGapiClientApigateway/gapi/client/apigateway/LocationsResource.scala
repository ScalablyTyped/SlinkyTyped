package typingsSlinky.maximMazurokGapiClientApigateway.gapi.client.apigateway

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Callback
import typingsSlinky.maximMazurokGapiClientApigateway.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var apis: ApisResource = js.native
  
  var gateways: GatewaysResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[ApigatewayLocation] = js.native
  def get(request: Callback): Request[ApigatewayLocation] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ApigatewayListLocationsResponse] = js.native
  def list(request: PageSize): Request[ApigatewayListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
}
