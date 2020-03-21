package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPhotoslibrary.AnonExcludeNonAppCreatedData
import typingsSlinky.gapiClientPhotoslibrary.AnonKey
import typingsSlinky.gapiClientPhotoslibrary.AnonShareToken
import typingsSlinky.gapiClientPhotoslibrary.AnonUploadType
import typingsSlinky.gapiClientPhotoslibrary.AnonUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumsResource extends js.Object {
  /** Returns the album based on the specified `shareToken`. */
  def get(request: AnonShareToken): Request_[Album] = js.native
  def join(request: AnonKey, body: JoinSharedAlbumRequest): Request_[JoinSharedAlbumResponse] = js.native
  /** Joins a shared album on behalf of the Google Photos user. */
  def join(request: AnonUploadType): Request_[JoinSharedAlbumResponse] = js.native
  def leave(request: AnonKey, body: LeaveSharedAlbumRequest): Request_[js.Object] = js.native
  /**
    * Leaves a previously-joined shared album on behalf of the Google Photos
    * user. The user must not own this album.
    */
  def leave(request: AnonUploadprotocol): Request_[js.Object] = js.native
  /**
    * Lists all shared albums available in the Sharing tab of the
    * user's Google Photos app.
    */
  def list(request: AnonExcludeNonAppCreatedData): Request_[ListSharedAlbumsResponse] = js.native
}

