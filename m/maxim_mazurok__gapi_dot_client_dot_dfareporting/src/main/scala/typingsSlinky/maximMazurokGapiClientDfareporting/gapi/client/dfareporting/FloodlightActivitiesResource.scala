package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FieldsIdKey
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FloodlightActivityGroupIds
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FloodlightActivityId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.OauthtokenPrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivitiesResource extends js.Object {
  
  /** Deletes an existing floodlight activity. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Generates a tag for a floodlight activity. */
  def generatetag(): Request[FloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(request: FloodlightActivityId): Request[FloodlightActivitiesGenerateTagResponse] = js.native
  
  /** Gets one floodlight activity by ID. */
  def get(): Request[FloodlightActivity] = js.native
  def get(request: Alt): Request[FloodlightActivity] = js.native
  
  def insert(request: Callback, body: FloodlightActivity): Request[FloodlightActivity] = js.native
  /** Inserts a new floodlight activity. */
  def insert(request: OauthtokenPrettyPrintProfileId): Request[FloodlightActivity] = js.native
  
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(): Request[FloodlightActivitiesListResponse] = js.native
  def list(request: FloodlightActivityGroupIds): Request[FloodlightActivitiesListResponse] = js.native
  
  def patch(request: Alt, body: FloodlightActivity): Request[FloodlightActivity] = js.native
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: FieldsIdKey): Request[FloodlightActivity] = js.native
  
  def update(request: Callback, body: FloodlightActivity): Request[FloodlightActivity] = js.native
  /** Updates an existing floodlight activity. */
  def update(request: OauthtokenPrettyPrintProfileId): Request[FloodlightActivity] = js.native
}
