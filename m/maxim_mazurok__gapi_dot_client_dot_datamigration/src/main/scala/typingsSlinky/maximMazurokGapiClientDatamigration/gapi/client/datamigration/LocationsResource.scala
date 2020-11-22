package typingsSlinky.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatamigration.anon.Fields
import typingsSlinky.maximMazurokGapiClientDatamigration.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var connectionProfiles: ConnectionProfilesResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Fields): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var migrationJobs: MigrationJobsResource = js.native
  
  var operations: OperationsResource = js.native
}
