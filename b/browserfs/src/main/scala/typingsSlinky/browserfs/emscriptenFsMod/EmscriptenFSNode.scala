package typingsSlinky.browserfs.emscriptenFsMod

import typingsSlinky.browserfs.AnonOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenFSNode extends js.Object {
  var mode: Double = js.native
  var mount: AnonOpts = js.native
  var name: String = js.native
  var node_ops: EmscriptenNodeOps = js.native
  var parent: EmscriptenFSNode = js.native
  var stream_ops: EmscriptenStreamOps = js.native
}

object EmscriptenFSNode {
  @scala.inline
  def apply(
    mode: Double,
    mount: AnonOpts,
    name: String,
    node_ops: EmscriptenNodeOps,
    parent: EmscriptenFSNode,
    stream_ops: EmscriptenStreamOps
  ): EmscriptenFSNode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_ops = node_ops.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], stream_ops = stream_ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenFSNode]
  }
  @scala.inline
  implicit class EmscriptenFSNodeOps[Self <: EmscriptenFSNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMount(value: AnonOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_ops(value: EmscriptenNodeOps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: EmscriptenFSNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_ops(value: EmscriptenStreamOps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_ops")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

