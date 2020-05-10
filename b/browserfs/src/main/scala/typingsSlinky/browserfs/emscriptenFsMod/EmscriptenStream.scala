package typingsSlinky.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenStream extends js.Object {
  var flags: String = js.native
  var nfd: js.Any = js.native
  var node: EmscriptenFSNode = js.native
  var position: Double = js.native
}

object EmscriptenStream {
  @scala.inline
  def apply(flags: String, nfd: js.Any, node: EmscriptenFSNode, position: Double): EmscriptenStream = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenStream]
  }
  @scala.inline
  implicit class EmscriptenStreamOps[Self <: EmscriptenStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNfd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: EmscriptenFSNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

