package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.RegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCategoriesResource extends js.Object {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoCategoryListResponse] = js.native
  def list(request: RegionCode): Request[VideoCategoryListResponse] = js.native
}
