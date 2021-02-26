package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.ChannelId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBannersResource extends StObject {
  
  /** Inserts a new resource into this collection. */
  def insert(request: ChannelId): Request[ChannelBannerResource] = js.native
  def insert(request: OnBehalfOfContentOwner, body: ChannelBannerResource): Request[ChannelBannerResource] = js.native
}
