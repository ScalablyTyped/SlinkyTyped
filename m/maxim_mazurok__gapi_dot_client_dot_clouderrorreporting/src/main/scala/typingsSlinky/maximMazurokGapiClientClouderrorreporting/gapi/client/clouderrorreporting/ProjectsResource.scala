package typingsSlinky.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Deletes all error events of a given project. */
  def deleteEvents(): Request[js.Object] = js.native
  def deleteEvents(request: Callback): Request[js.Object] = js.native
  
  var events: EventsResource = js.native
  
  var groupStats: GroupStatsResource = js.native
  
  var groups: GroupsResource = js.native
}
