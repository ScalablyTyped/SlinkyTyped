package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.PageToken
import typingsSlinky.gapiClientGames.anon.SnapshotId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /** Retrieves the metadata for a given snapshot ID. */
  def get(request: SnapshotId): Request[Snapshot]
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: PageToken): Request[SnapshotListResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(get: SnapshotId => Request[Snapshot], list: PageToken => Request[SnapshotListResponse]): SnapshotsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SnapshotsResource]
  }
}

