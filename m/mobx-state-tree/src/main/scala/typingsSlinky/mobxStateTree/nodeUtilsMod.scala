package typingsSlinky.mobxStateTree

import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import typingsSlinky.mobxStateTree.typeMod.STNValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/node/node-utils", JSImport.Namespace)
@js.native
object nodeUtilsMod extends js.Object {
  
  def isStateTreeNode[IT /* <: IAnyComplexType */](value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = js.native
  
  @js.native
  trait IStateTreeNode[IT /* <: IAnyType */] extends js.Object
  
  type IAnyStateTreeNode = STNValue[js.Any, IAnyType]
  
  type TypeOfValue[T /* <: IAnyStateTreeNode */] = js.Any
}
