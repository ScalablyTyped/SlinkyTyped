package typingsSlinky.mobxStateTree.mstOperationsMod

import typingsSlinky.mobxStateTree.jsonPatchMod.IJsonPatch
import typingsSlinky.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typingsSlinky.mobxStateTree.utilsMod.IDisposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "onPatch")
@js.native
object onPatch extends js.Object {
  
  def apply(
    target: IAnyStateTreeNode,
    callback: js.Function2[/* patch */ IJsonPatch, /* reversePatch */ IJsonPatch, Unit]
  ): IDisposer = js.native
}
