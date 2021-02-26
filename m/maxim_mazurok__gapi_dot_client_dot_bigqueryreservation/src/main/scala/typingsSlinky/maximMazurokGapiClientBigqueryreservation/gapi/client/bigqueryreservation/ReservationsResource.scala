package typingsSlinky.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.Fields
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.ReservationId
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientBigqueryreservation.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsResource extends StObject {
  
  var assignments: AssignmentsResource = js.native
  
  /** Creates a new reservation resource. */
  def create(request: ReservationId): Request[Reservation] = js.native
  def create(request: UploadType, body: Reservation): Request[Reservation] = js.native
  
  /** Deletes a reservation. Returns `google.rpc.Code.FAILED_PRECONDITION` when reservation has assignments. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Returns information about the reservation. */
  def get(): Request[Reservation] = js.native
  def get(request: Accesstoken): Request[Reservation] = js.native
  
  /** Lists all the reservations for the project in the specified location. */
  def list(): Request[ListReservationsResponse] = js.native
  def list(request: Fields): Request[ListReservationsResponse] = js.native
  
  def patch(request: PrettyPrint, body: Reservation): Request[Reservation] = js.native
  /** Updates an existing reservation resource. */
  def patch(request: UpdateMask): Request[Reservation] = js.native
}
