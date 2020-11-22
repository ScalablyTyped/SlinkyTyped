package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigquery.anon.DatasetId
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Filter
import typingsSlinky.maximMazurokGapiClientBigquery.anon.ReadMask
import typingsSlinky.maximMazurokGapiClientBigquery.anon.Resource
import typingsSlinky.maximMazurokGapiClientBigquery.anon.RoutineId
import typingsSlinky.maximMazurokGapiClientBigquery.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutinesResource extends js.Object {
  
  /** Deletes the routine specified by routineId from the dataset. */
  def delete(): Request[Unit] = js.native
  def delete(request: RoutineId): Request[Unit] = js.native
  
  /** Gets the specified routine resource by routine ID. */
  def get(): Request[Routine] = js.native
  def get(request: ReadMask): Request[Routine] = js.native
  
  def insert(request: DatasetId, body: Routine): Request[Routine] = js.native
  /** Creates a new routine in the dataset. */
  def insert(request: Resource): Request[Routine] = js.native
  
  /** Lists all routines in the specified dataset. Requires the READER dataset role. */
  def list(): Request[ListRoutinesResponse] = js.native
  def list(request: Filter): Request[ListRoutinesResponse] = js.native
  
  def update(request: RoutineId, body: Routine): Request[Routine] = js.native
  /** Updates information in an existing routine. The update method replaces the entire Routine resource. */
  def update(request: UserIp): Request[Routine] = js.native
}
