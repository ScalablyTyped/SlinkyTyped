package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientMonitoring.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends StObject {
  
  /** Lists the monitored resources that are members of a group. */
  def list(): Request[ListGroupMembersResponse] = js.native
  def list(request: Filter): Request[ListGroupMembersResponse] = js.native
}
