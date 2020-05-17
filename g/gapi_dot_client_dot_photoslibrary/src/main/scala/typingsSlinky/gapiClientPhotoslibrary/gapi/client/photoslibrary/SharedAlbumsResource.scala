package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPhotoslibrary.anon.ExcludeNonAppCreatedData
import typingsSlinky.gapiClientPhotoslibrary.anon.Key
import typingsSlinky.gapiClientPhotoslibrary.anon.ShareToken
import typingsSlinky.gapiClientPhotoslibrary.anon.UploadType
import typingsSlinky.gapiClientPhotoslibrary.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumsResource extends js.Object {
  /** Returns the album based on the specified `shareToken`. */
  def get(request: ShareToken): Request[Album] = js.native
  def join(request: Key, body: JoinSharedAlbumRequest): Request[JoinSharedAlbumResponse] = js.native
  /** Joins a shared album on behalf of the Google Photos user. */
  def join(request: UploadType): Request[JoinSharedAlbumResponse] = js.native
  def leave(request: Key, body: LeaveSharedAlbumRequest): Request[js.Object] = js.native
  /**
    * Leaves a previously-joined shared album on behalf of the Google Photos
    * user. The user must not own this album.
    */
  def leave(request: Uploadprotocol): Request[js.Object] = js.native
  /**
    * Lists all shared albums available in the Sharing tab of the
    * user's Google Photos app.
    */
  def list(request: ExcludeNonAppCreatedData): Request[ListSharedAlbumsResponse] = js.native
}

