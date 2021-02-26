package typingsSlinky.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientArea120tables.anon.Name
import typingsSlinky.maximMazurokGapiClientArea120tables.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesResource extends StObject {
  
  /** Gets a table. Returns NOT_FOUND if the table does not exist. */
  def get(): Request[Table] = js.native
  def get(request: Name): Request[Table] = js.native
  
  /** Lists tables for the user. */
  def list(): Request[ListTablesResponse] = js.native
  def list(request: PageToken): Request[ListTablesResponse] = js.native
  
  var rows: RowsResource = js.native
}
