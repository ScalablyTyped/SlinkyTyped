package typingsSlinky.angularCore

import typingsSlinky.angularCore.helpersMod.HelperFunction
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNode extends js.Object {
  var node: Node | Null = js.native
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.native
}

object AnonNode {
  @scala.inline
  def apply(): AnonNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNode]
  }
  @scala.inline
  implicit class AnonNodeOps[Self <: AnonNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(null)
        ret
    }
    @scala.inline
    def withRequiredHelpers(value: js.Array[HelperFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredHelpers")(js.undefined)
        ret
    }
  }
  
}

