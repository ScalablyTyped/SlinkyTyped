package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.helpersMod.HelperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typingsSlinky.typescript.mod.Node | Null
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.undefined
}

object Node {
  @scala.inline
  def apply(node: typingsSlinky.typescript.mod.Node = null, requiredHelpers: js.Array[HelperFunction] = null): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (requiredHelpers != null) __obj.updateDynamic("requiredHelpers")(requiredHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

