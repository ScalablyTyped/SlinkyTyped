package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.CategoryId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Part
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ChannelListResponse] = js.native
  def list(request: CategoryId): Request[ChannelListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: Part): Request[Channel] = js.native
  def update(request: PrettyPrint, body: Channel): Request[Channel] = js.native
}
