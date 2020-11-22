package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AltCallbackFields
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventsResource extends js.Object {
  
  /** Inserts custom events. */
  def batchinsert(request: AltCallbackFields): Request[CustomEventsBatchInsertResponse] = js.native
  def batchinsert(request: Callback, body: CustomEventsBatchInsertRequest): Request[CustomEventsBatchInsertResponse] = js.native
}
