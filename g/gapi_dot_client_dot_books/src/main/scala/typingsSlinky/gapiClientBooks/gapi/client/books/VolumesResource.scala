package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAlt
import typingsSlinky.gapiClientBooks.AnonCountry
import typingsSlinky.gapiClientBooks.AnonDownload
import typingsSlinky.gapiClientBooks.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumesResource extends js.Object {
  var associated: AssociatedResource = js.native
  var mybooks: MybooksResource = js.native
  var recommended: RecommendedResource = js.native
  var useruploaded: UseruploadedResource = js.native
  /** Gets volume information for a single volume. */
  def get(request: AnonFields): Request_[Volume] = js.native
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: AnonAlt): Request_[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: AnonCountry): Request_[Volumes] = js.native
  /** Performs a book search. */
  def list(request: AnonDownload): Request_[Volumes] = js.native
}

