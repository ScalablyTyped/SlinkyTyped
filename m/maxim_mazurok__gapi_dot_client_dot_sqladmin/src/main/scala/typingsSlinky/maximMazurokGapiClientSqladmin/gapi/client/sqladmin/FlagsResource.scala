package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.DatabaseVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagsResource extends js.Object {
  
  /** List all available database flags for Cloud SQL instances. */
  def list(): Request[FlagsListResponse] = js.native
  def list(request: DatabaseVersion): Request[FlagsListResponse] = js.native
}
