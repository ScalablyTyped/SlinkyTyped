package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.Key
import typingsSlinky.gapiClientBooks.anon.Oauthtoken
import typingsSlinky.gapiClientBooks.anon.PrettyPrint
import typingsSlinky.gapiClientBooks.anon.QuotaUser
import typingsSlinky.gapiClientBooks.anon.Shelf
import typingsSlinky.gapiClientBooks.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: PrettyPrint): Request[Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: QuotaUser): Request[Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: Key): Request[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: QuotaUser): Request[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: Oauthtoken): Request[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: UserIp): Request[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: Shelf): Request[Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: PrettyPrint): Request[Unit] = js.native
}

