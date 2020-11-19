package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.PageToken
import typingsSlinky.gapiClientGames.anon.SnapshotId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends js.Object {
  
  /** Retrieves the metadata for a given snapshot ID. */
  def get(request: SnapshotId): Request[Snapshot] = js.native
  
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: PageToken): Request[SnapshotListResponse] = js.native
}
object SnapshotsResource {
  
  @scala.inline
  def apply(get: SnapshotId => Request[Snapshot], list: PageToken => Request[SnapshotListResponse]): SnapshotsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SnapshotsResource]
  }
  
  @scala.inline
  implicit class SnapshotsResourceOps[Self <: SnapshotsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: SnapshotId => Request[Snapshot]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: PageToken => Request[SnapshotListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
