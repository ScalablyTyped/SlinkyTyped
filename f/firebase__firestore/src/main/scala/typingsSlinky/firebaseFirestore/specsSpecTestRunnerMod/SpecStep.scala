package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecStep extends js.Object {
  /** Listens to a SnapshotsInSync event. */
  var addSnapshotsInSyncListener: js.UndefOr[`true`] = js.native
  /** Changes the metadata state of a client instance. */
  var applyClientState: js.UndefOr[SpecClientState] = js.native
  /** Change to a new active user (specified by uid or null for anonymous). */
  var changeUser: js.UndefOr[String | Null] = js.native
  /** Clears the persistent storage in IndexedDB. */
  var clearPersistence: js.UndefOr[`true`] = js.native
  /** The index of the local client for multi-client spec tests. */
  var clientIndex: js.UndefOr[Double] = js.native
  /**
    * Process all events currently enqueued in the AsyncQueue.
    */
  var drainQueue: js.UndefOr[`true`] = js.native
  /** Enable or disable RemoteStore's network connection. */
  var enableNetwork: js.UndefOr[Boolean] = js.native
  /**
    * Optional list of expected events.
    * If not provided, the test will fail if the step causes events to be raised.
    */
  var expectedSnapshotEvents: js.UndefOr[js.Array[SnapshotEvent]] = js.native
  /**
    * Optional expected number of onSnapshotsInSync callbacks to be called.
    * If not provided, the test will fail if the step causes events to be raised.
    */
  var expectedSnapshotsInSyncEvents: js.UndefOr[Double] = js.native
  /**
    * Optional dictionary of expected states.
    */
  var expectedState: js.UndefOr[StateExpectation] = js.native
  /** Fail a write */
  var failWrite: js.UndefOr[SpecWriteFailure] = js.native
  /** Unlistens from a SnapshotsInSync event. */
  var removeSnapshotsInSyncListener: js.UndefOr[`true`] = js.native
  /**
    * Restarts the SyncEngine from scratch, except re-uses persistence and auth
    * components. This allows you to queue writes, get documents into cache,
    * etc. and then simulate an app restart.
    */
  var restart: js.UndefOr[`true`] = js.native
  /**
    * Run a queued timer task (without waiting for the delay to expire). See
    * TimerId enum definition for possible values).
    */
  var runTimer: js.UndefOr[String] = js.native
  /** Shut down the client and close it network connection. */
  var shutdown: js.UndefOr[`true`] = js.native
  /** Perform a user initiated delete */
  var userDelete: js.UndefOr[SpecUserDelete] = js.native
  /** Listen to a new query (must be unique) */
  var userListen: js.UndefOr[SpecUserListen] = js.native
  /** Perform a user initiated patch */
  var userPatch: js.UndefOr[SpecUserPatch] = js.native
  /** Perform a user initiated set */
  var userSet: js.UndefOr[SpecUserSet] = js.native
  /** Unlisten from a query (must be listened to) */
  var userUnlisten: js.UndefOr[SpecUserUnlisten] = js.native
  /** Ack for a query in the watch stream */
  var watchAck: js.UndefOr[SpecWatchAck] = js.native
  /** Marks the query results as current */
  var watchCurrent: js.UndefOr[SpecWatchCurrent] = js.native
  /** Document update in the watch stream */
  var watchEntity: js.UndefOr[SpecWatchEntity] = js.native
  /** Existence filter in the watch stream */
  var watchFilter: js.UndefOr[SpecWatchFilter] = js.native
  /** Ack for remove or rejection of a query in the watch stream */
  var watchRemove: js.UndefOr[SpecWatchRemove] = js.native
  /** Reset the results of a query */
  var watchReset: js.UndefOr[SpecWatchReset] = js.native
  /** Snapshot ("NO_CHANGE") event in the watch stream. */
  var watchSnapshot: js.UndefOr[SpecWatchSnapshot] = js.native
  /** A step that the watch stream restarts. */
  var watchStreamClose: js.UndefOr[SpecWatchStreamClose] = js.native
  /** Ack the last write */
  var writeAck: js.UndefOr[SpecWriteAck] = js.native
}

object SpecStep {
  @scala.inline
  def apply(): SpecStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecStep]
  }
  @scala.inline
  implicit class SpecStepOps[Self <: SpecStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSnapshotsInSyncListener(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSnapshotsInSyncListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSnapshotsInSyncListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSnapshotsInSyncListener")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyClientState(value: SpecClientState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyClientState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyClientState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyClientState")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeUser")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeUser")(null)
        ret
    }
    @scala.inline
    def withClearPersistence(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearPersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainQueue(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedSnapshotEvents(value: js.Array[SnapshotEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSnapshotEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedSnapshotEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSnapshotEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedSnapshotsInSyncEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSnapshotsInSyncEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedSnapshotsInSyncEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSnapshotsInSyncEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedState(value: StateExpectation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedState")(js.undefined)
        ret
    }
    @scala.inline
    def withFailWrite(value: SpecWriteFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSnapshotsInSyncListener(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSnapshotsInSyncListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSnapshotsInSyncListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSnapshotsInSyncListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRestart(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
    @scala.inline
    def withRunTimer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdown(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDelete(value: SpecUserDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withUserListen(value: SpecUserListen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userListen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserListen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userListen")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPatch(value: SpecUserPatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPatch")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSet(value: SpecUserSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSet")(js.undefined)
        ret
    }
    @scala.inline
    def withUserUnlisten(value: SpecUserUnlisten): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUnlisten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserUnlisten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUnlisten")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchAck(value: SpecWatchAck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAck")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchCurrent(value: SpecWatchCurrent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchEntity(value: SpecWatchEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchFilter(value: SpecWatchFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchRemove(value: SpecWatchRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchReset(value: SpecWatchReset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchReset")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchSnapshot(value: SpecWatchSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchStreamClose(value: SpecWatchStreamClose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchStreamClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchStreamClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchStreamClose")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAck(value: SpecWriteAck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAck")(js.undefined)
        ret
    }
  }
  
}

