package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsLevelsResource extends StObject {
  
  /** Retrieves a list of all pricing levels offered by a creator to the fans. */
  def list(): Request[MembershipsLevelListResponse] = js.native
  def list(request: Alt): Request[MembershipsLevelListResponse] = js.native
}
