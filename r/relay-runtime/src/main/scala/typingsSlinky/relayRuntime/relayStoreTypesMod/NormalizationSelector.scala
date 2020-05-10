package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationSelector extends js.Object {
  val dataID: DataID = js.native
  val node: NormalizationSelectableNode = js.native
  val variables: Variables = js.native
}

object NormalizationSelector {
  @scala.inline
  def apply(dataID: DataID, node: NormalizationSelectableNode, variables: Variables): NormalizationSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelector]
  }
  @scala.inline
  implicit class NormalizationSelectorOps[Self <: NormalizationSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataID(value: DataID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: NormalizationSelectableNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

