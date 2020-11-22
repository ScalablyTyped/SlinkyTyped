package typingsSlinky.mobxStateTree.mstOperationsMod

import typingsSlinky.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typingsSlinky.mobxStateTree.typeMod.IType
import typingsSlinky.mobxStateTree.utilsMod.IDisposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/mst-operations", "onSnapshot")
@js.native
object onSnapshot extends js.Object {
  
  def apply[S](target: IStateTreeNode[IType[_, S, _]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = js.native
}
