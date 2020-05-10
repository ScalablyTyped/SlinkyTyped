package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayConnectionMod.ConnectionEvent
import typingsSlinky.relayRuntime.relayRuntimeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdgeData[TEdge] extends ConnectionEvent[TEdge] {
  var edgeData: StringDictionary[TEdge] = js.native
  var kind: update = js.native
}

object AnonEdgeData {
  @scala.inline
  def apply[TEdge](edgeData: StringDictionary[TEdge], kind: update): AnonEdgeData[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdgeData[TEdge]]
  }
  @scala.inline
  implicit class AnonEdgeDataOps[Self[tedge] <: AnonEdgeData[tedge], TEdge] (val x: Self[TEdge]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEdge] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEdge] with Other]
    @scala.inline
    def withEdgeData(value: StringDictionary[TEdge]): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: update): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

