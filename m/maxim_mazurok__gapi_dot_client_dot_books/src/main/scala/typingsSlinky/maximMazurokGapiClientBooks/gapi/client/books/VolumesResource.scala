package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientBooks.anon.Alt
import typingsSlinky.maximMazurokGapiClientBooks.anon.Callback
import typingsSlinky.maximMazurokGapiClientBooks.anon.Download
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumesResource extends js.Object {
  
  var associated: AssociatedResource = js.native
  
  /** Gets volume information for a single volume. */
  def get(): Request[Volume] = js.native
  def get(request: Callback): Request[Volume] = js.native
  
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(): Request[Volumes] = js.native
  def list(request: Accesstoken): Request[Volumes] = js.native
  def list(request: Alt): Request[Volumes] = js.native
  def list(request: Download): Request[Volumes] = js.native
  
  var mybooks: MybooksResource = js.native
  
  var recommended: RecommendedResource = js.native
  
  var useruploaded: UseruploadedResource = js.native
}
