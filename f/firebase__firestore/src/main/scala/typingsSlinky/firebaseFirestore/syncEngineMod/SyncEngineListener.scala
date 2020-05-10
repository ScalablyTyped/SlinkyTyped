package typingsSlinky.firebaseFirestore.syncEngineMod

import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.typesMod.OnlineState
import typingsSlinky.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncEngineListener extends js.Object {
  /** Handles a change in online state. */
  def onOnlineStateChange(onlineState: OnlineState): Unit = js.native
  /** Handles new view snapshots. */
  def onWatchChange(snapshots: js.Array[ViewSnapshot]): Unit = js.native
  /** Handles the failure of a query. */
  def onWatchError(query: Query, error: js.Error): Unit = js.native
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
  @scala.inline
  implicit class SyncEngineListenerOps[Self <: SyncEngineListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnOnlineStateChange(value: OnlineState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnlineStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWatchChange(value: js.Array[ViewSnapshot] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWatchChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWatchError(value: (Query, js.Error) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWatchError")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

