package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFitness.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPointChangesResource extends js.Object {
  
  /** Queries for user's data point changes for a particular data source. */
  def list(): Request[ListDataPointChangesResponse] = js.native
  def list(request: Callback): Request[ListDataPointChangesResponse] = js.native
}
