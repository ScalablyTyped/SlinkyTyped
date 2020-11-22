package typingsSlinky.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpUrlsResource extends js.Object {
  
  /** Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format). */
  def batchGet(request: Accesstoken): Request[BatchGetAmpUrlsResponse] = js.native
  def batchGet(request: Alt, body: BatchGetAmpUrlsRequest): Request[BatchGetAmpUrlsResponse] = js.native
}
