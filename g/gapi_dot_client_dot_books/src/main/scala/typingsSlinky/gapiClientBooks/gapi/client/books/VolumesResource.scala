package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.Alt
import typingsSlinky.gapiClientBooks.anon.Country
import typingsSlinky.gapiClientBooks.anon.Download
import typingsSlinky.gapiClientBooks.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumesResource extends js.Object {
  
  var associated: AssociatedResource = js.native
  
  /** Gets volume information for a single volume. */
  def get(request: Fields): Request[Volume] = js.native
  
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: Alt): Request[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: Country): Request[Volumes] = js.native
  /** Performs a book search. */
  def list(request: Download): Request[Volumes] = js.native
  
  var mybooks: MybooksResource = js.native
  
  var recommended: RecommendedResource = js.native
  
  var useruploaded: UseruploadedResource = js.native
}
