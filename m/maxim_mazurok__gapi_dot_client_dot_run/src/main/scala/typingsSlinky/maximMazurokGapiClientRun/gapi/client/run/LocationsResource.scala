package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRun.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var authorizeddomains: AuthorizeddomainsResource = js.native
  
  var configurations: ConfigurationsResource = js.native
  
  var domainmappings: DomainmappingsResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var revisions: RevisionsResource = js.native
  
  var routes: RoutesResource = js.native
  
  var services: ServicesResource = js.native
}
