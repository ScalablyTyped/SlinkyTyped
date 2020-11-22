package typingsSlinky.mobxStateTree.mstOperationsMod

import typingsSlinky.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typingsSlinky.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "getSnapshot")
@js.native
object getSnapshot extends js.Object {
  
  def apply[S](target: IStateTreeNode[IType[_, S, _]]): S = js.native
  def apply[S](target: IStateTreeNode[IType[_, S, _]], applyPostProcess: Boolean): S = js.native
}
