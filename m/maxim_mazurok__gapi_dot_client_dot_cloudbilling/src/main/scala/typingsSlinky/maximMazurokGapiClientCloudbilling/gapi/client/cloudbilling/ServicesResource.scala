package typingsSlinky.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudbilling.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends js.Object {
  
  /** Lists all public cloud services. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: PageSize): Request[ListServicesResponse] = js.native
  
  var skus: SkusResource = js.native
}
