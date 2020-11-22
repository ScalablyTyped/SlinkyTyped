package typingsSlinky.mobxStateTree.onActionMod

import typingsSlinky.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typingsSlinky.mobxStateTree.utilsMod.IDisposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/middlewares/on-action", "onAction")
@js.native
object onAction extends js.Object {
  
  def apply(target: IAnyStateTreeNode, listener: js.Function1[/* call */ ISerializedActionCall, Unit]): IDisposer = js.native
  def apply(
    target: IAnyStateTreeNode,
    listener: js.Function1[/* call */ ISerializedActionCall, Unit],
    attachAfter: Boolean
  ): IDisposer = js.native
}
