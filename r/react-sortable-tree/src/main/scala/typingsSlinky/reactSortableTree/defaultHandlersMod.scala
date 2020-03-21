package typingsSlinky.reactSortableTree

import typingsSlinky.reactSortableTree.mod.SearchData
import typingsSlinky.reactSortableTree.mod.TreeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/default-handlers", JSImport.Namespace)
@js.native
object defaultHandlersMod extends js.Object {
  def defaultGetNodeKey(data: TreeIndex): Double = js.native
  def defaultSearchMethod(data: SearchData): Boolean = js.native
}

