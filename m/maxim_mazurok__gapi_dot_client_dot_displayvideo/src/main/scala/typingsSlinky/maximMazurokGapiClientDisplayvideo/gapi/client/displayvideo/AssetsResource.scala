package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetsResource extends js.Object {
  
  /** Uploads an asset. Returns the ID of the newly uploaded asset if successful. The asset file size should be no more than 10 MB for images, 200 MB for ZIP files, and 1 GB for videos. */
  def upload(request: Accesstoken): Request[CreateAssetResponse] = js.native
  def upload(request: AdvertiserId, body: CreateAssetRequest): Request[CreateAssetResponse] = js.native
}
