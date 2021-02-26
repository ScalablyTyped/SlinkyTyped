package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AdvertiserIdAlt
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.CallbackChannelId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.ChannelIdFields
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PageSize
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PageToken
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: AccesstokenAdvertiserId): Request[Channel] = js.native
  def create(request: AdvertiserIdAlt, body: Channel): Request[Channel] = js.native
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: CallbackFields): Request[Channel] = js.native
  def create(request: FieldsKey, body: Channel): Request[Channel] = js.native
  
  /** Gets a channel for a partner or advertiser. */
  def get(): Request[Channel] = js.native
  def get(request: PrettyPrint): Request[Channel] = js.native
  def get(request: Xgafv): Request[Channel] = js.native
  
  /** Lists channels for a partner or advertiser. */
  def list(): Request[ListChannelsResponse] = js.native
  def list(request: PageSize): Request[ListChannelsResponse] = js.native
  def list(request: PageToken): Request[ListChannelsResponse] = js.native
  
  def patch(request: AltCallback, body: Channel): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: CallbackChannelId): Request[Channel] = js.native
  def patch(request: ChannelIdFields, body: Channel): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: UpdateMask): Request[Channel] = js.native
  
  var sites: SitesResource = js.native
}
