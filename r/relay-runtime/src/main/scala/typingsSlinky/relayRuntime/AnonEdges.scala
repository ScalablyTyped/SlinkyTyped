package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayConnectionMod.ConnectionEvent
import typingsSlinky.relayRuntime.relayConnectionMod.PageInfo
import typingsSlinky.relayRuntime.relayRuntimeStrings.fetch
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdges[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables = js.native
  var edges: js.Array[TEdge] = js.native
  var kind: fetch = js.native
  var pageInfo: PageInfo = js.native
}

object AnonEdges {
  @scala.inline
  def apply[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): AnonEdges[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdges[TEdge]]
  }
  @scala.inline
  implicit class AnonEdgesOps[Self[tedge] <: AnonEdges[tedge], TEdge] (val x: Self[TEdge]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEdge] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEdge] with Other]
    @scala.inline
    def withArgs(value: Variables): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[TEdge]): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: fetch): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInfo(value: PageInfo): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

