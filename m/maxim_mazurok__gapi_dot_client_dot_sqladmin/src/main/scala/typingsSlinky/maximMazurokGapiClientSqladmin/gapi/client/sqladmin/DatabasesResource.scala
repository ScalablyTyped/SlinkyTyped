package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Callback
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Instance
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabasesResource extends js.Object {
  
  /** Deletes a database from a Cloud SQL instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientSqladmin.anon.Database): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(): Request[Database] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientSqladmin.anon.Database): Request[Database] = js.native
  
  def insert(request: Callback, body: Database): Request[Operation] = js.native
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Instance): Request[Operation] = js.native
  
  /** Lists databases in the specified Cloud SQL instance. */
  def list(): Request[DatabasesListResponse] = js.native
  def list(request: Callback): Request[DatabasesListResponse] = js.native
  
  def patch(request: typingsSlinky.maximMazurokGapiClientSqladmin.anon.Database, body: Database): Request[Operation] = js.native
  /** Partially updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: Key): Request[Operation] = js.native
  
  def update(request: typingsSlinky.maximMazurokGapiClientSqladmin.anon.Database, body: Database): Request[Operation] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: Key): Request[Operation] = js.native
}
