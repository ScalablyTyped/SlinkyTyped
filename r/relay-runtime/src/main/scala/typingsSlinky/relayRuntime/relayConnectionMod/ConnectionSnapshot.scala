package typingsSlinky.relayRuntime.relayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.TypedSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionSnapshot[TEdge, TState] extends js.Object {
  var edgeSnapshots: StringDictionary[TypedSnapshot[TEdge]] = js.native
  var id: ConnectionID = js.native
  var reference: ConnectionReference[TEdge] = js.native
  var seenRecords: RecordMap = js.native
  var state: TState = js.native
}

object ConnectionSnapshot {
  @scala.inline
  def apply[TEdge, TState](
    edgeSnapshots: StringDictionary[TypedSnapshot[TEdge]],
    id: ConnectionID,
    reference: ConnectionReference[TEdge],
    seenRecords: RecordMap,
    state: TState
  ): ConnectionSnapshot[TEdge, TState] = {
    val __obj = js.Dynamic.literal(edgeSnapshots = edgeSnapshots.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], seenRecords = seenRecords.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSnapshot[TEdge, TState]]
  }
  @scala.inline
  implicit class ConnectionSnapshotOps[Self[tedge, tstate] <: ConnectionSnapshot[tedge, tstate], TEdge, TState] (val x: Self[TEdge, TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge, TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge, TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEdge, TState]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEdge, TState]) with Other]
    @scala.inline
    def withEdgeSnapshots(value: StringDictionary[TypedSnapshot[TEdge]]): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ConnectionID): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: ConnectionReference[TEdge]): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeenRecords(value: RecordMap): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seenRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TState): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

