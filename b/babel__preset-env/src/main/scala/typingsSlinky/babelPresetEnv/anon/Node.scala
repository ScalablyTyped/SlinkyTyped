package typingsSlinky.babelPresetEnv.anon

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.current
import typingsSlinky.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends _TargetsOptions {
  var node: String | current | `true`
}

object Node {
  @scala.inline
  def apply(node: String | current | `true`): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

