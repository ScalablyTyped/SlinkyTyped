package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonKeyOauthtoken
import typingsSlinky.gapiClientCompute.AnonQuotaUserSnapshot
import typingsSlinky.gapiClientCompute.AnonSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotsResource extends js.Object {
  /**
    * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If
    * any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
    *
    * For more information, see Deleting snaphots.
    */
  def delete(request: AnonSnapshot): Request_[Operation] = js.native
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: AnonQuotaUserSnapshot): Request_[Snapshot] = js.native
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: AnonAlt): Request_[SnapshotList] = js.native
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonKeyOauthtoken): Request_[Operation] = js.native
}

object SnapshotsResource {
  @scala.inline
  def apply(
    delete: AnonSnapshot => Request_[Operation],
    get: AnonQuotaUserSnapshot => Request_[Snapshot],
    list: AnonAlt => Request_[SnapshotList],
    setLabels: AnonKeyOauthtoken => Request_[Operation]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[SnapshotsResource]
  }
  @scala.inline
  implicit class SnapshotsResourceOps[Self <: SnapshotsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonSnapshot => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserSnapshot => Request_[Snapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[SnapshotList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabels(value: AnonKeyOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

