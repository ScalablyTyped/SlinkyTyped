package typingsSlinky.firebaseFirestore.syncEngineMod

import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.typesMod.OnlineState
import typingsSlinky.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncEngineListener extends js.Object {
  /** Handles a change in online state. */
  def onOnlineStateChange(onlineState: OnlineState): Unit
  /** Handles new view snapshots. */
  def onWatchChange(snapshots: js.Array[ViewSnapshot]): Unit
  /** Handles the failure of a query. */
  def onWatchError(query: Query, error: js.Error): Unit
}

object SyncEngineListener {
  @scala.inline
  def apply(
    onOnlineStateChange: OnlineState => Unit,
    onWatchChange: js.Array[ViewSnapshot] => Unit,
    onWatchError: (Query, js.Error) => Unit
  ): SyncEngineListener = {
    val __obj = js.Dynamic.literal(onOnlineStateChange = js.Any.fromFunction1(onOnlineStateChange), onWatchChange = js.Any.fromFunction1(onWatchChange), onWatchError = js.Any.fromFunction2(onWatchError))
    __obj.asInstanceOf[SyncEngineListener]
  }
}

