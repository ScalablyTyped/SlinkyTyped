package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FieldsFloodlightGroupId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupIdKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightGroupsResource extends js.Object {
  
  /** Gets a Floodlight group. */
  def get(): Request[FloodlightGroup] = js.native
  def get(request: FloodlightGroupId): Request[FloodlightGroup] = js.native
  
  /** Updates an existing Floodlight group. Returns the updated Floodlight group if successful. */
  def patch(request: FieldsFloodlightGroupId): Request[FloodlightGroup] = js.native
  def patch(request: FloodlightGroupIdKey, body: FloodlightGroup): Request[FloodlightGroup] = js.native
}
