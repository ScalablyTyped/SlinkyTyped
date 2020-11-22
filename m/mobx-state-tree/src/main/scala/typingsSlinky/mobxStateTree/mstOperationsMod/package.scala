package typingsSlinky.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mstOperationsMod {
  
  type TypeOrStateTreeNodeToStateTreeNode[T /* <: typingsSlinky.mobxStateTree.typeMod.IAnyType | typingsSlinky.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode */] = T | (js.Any with typingsSlinky.mobxStateTree.nodeUtilsMod.IStateTreeNode[T])
}
