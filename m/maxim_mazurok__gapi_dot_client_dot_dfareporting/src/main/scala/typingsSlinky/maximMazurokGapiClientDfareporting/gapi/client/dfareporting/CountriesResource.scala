package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.DartId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountriesResource extends js.Object {
  
  /** Gets one country by ID. */
  def get(): Request[Country] = js.native
  def get(request: DartId): Request[Country] = js.native
  
  /** Retrieves a list of countries. */
  def list(): Request[CountriesListResponse] = js.native
  def list(request: Callback): Request[CountriesListResponse] = js.native
}
