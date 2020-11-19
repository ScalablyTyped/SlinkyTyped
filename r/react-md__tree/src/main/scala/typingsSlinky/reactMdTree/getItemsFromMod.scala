package typingsSlinky.reactMdTree

import typingsSlinky.reactMdTree.typesMod.BaseTreeItem
import typingsSlinky.reactMdTree.typesMod.TreeData
import typingsSlinky.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/tree/types/getItemsFrom", JSImport.Namespace)
@js.native
object getItemsFromMod extends js.Object {
  
  def default[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = js.native
}
