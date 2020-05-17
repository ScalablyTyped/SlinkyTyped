package typingsSlinky.babelPresetEnv.anon

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.current
import typingsSlinky.babelPresetEnv.mod.TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends TargetsOptions {
  var node: String | current | `true` = js.native
}

object Node {
  @scala.inline
  def apply(node: String | current | `true`): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: String | current | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

