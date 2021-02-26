package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /** Search tenancy units for a managed service. */
  def search(): Request[SearchTenancyUnitsResponse] = js.native
  def search(request: PageSize): Request[SearchTenancyUnitsResponse] = js.native
  
  var tenancyUnits: TenancyUnitsResource = js.native
}
