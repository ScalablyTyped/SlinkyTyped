package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesResource extends js.Object {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ActivityListResponse] = js.native
  def list(request: Callback): Request[ActivityListResponse] = js.native
}
