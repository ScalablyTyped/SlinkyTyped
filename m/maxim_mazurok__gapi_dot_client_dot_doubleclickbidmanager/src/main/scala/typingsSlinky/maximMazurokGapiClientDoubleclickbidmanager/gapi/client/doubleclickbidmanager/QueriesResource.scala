package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Asynchronous
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Key
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.anon.QueryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueriesResource extends js.Object {
  
  /** Creates a query. */
  def createquery(request: Asynchronous): Request[Query] = js.native
  def createquery(request: Fields, body: Query): Request[Query] = js.native
  
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(): Request[Unit] = js.native
  def deletequery(request: Key): Request[Unit] = js.native
  
  /** Retrieves a stored query. */
  def getquery(): Request[Query] = js.native
  def getquery(request: Key): Request[Query] = js.native
  
  /** Retrieves stored queries. */
  def listqueries(): Request[ListQueriesResponse] = js.native
  def listqueries(request: Oauthtoken): Request[ListQueriesResponse] = js.native
  
  /** Runs a stored query to generate a report. */
  def runquery(request: PrettyPrint): Request[Unit] = js.native
  def runquery(request: QueryId, body: RunQueryRequest): Request[Unit] = js.native
}
