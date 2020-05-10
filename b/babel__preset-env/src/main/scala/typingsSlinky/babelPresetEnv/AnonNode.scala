package typingsSlinky.babelPresetEnv

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.current
import typingsSlinky.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNode extends _TargetsOptions {
  var node: String | current | `true` = js.native
}

object AnonNode {
  @scala.inline
  def apply(node: String | current | `true`): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
  @scala.inline
  implicit class AnonNodeOps[Self <: AnonNode] (val x: Self) extends AnyVal {
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

