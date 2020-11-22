package typingsSlinky.mobxStateTree.mstOperationsMod

import typingsSlinky.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "getParent")
@js.native
object getParent extends js.Object {
  
  def apply[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  def apply[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode, depth: Double): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
}
