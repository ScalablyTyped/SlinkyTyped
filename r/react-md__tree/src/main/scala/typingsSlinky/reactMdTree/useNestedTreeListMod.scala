package typingsSlinky.reactMdTree

import typingsSlinky.reactMdTree.anon.ChildItems
import typingsSlinky.reactMdTree.typesMod.BaseTreeItem
import typingsSlinky.reactMdTree.typesMod.TreeData
import typingsSlinky.reactMdTree.typesMod.TreeItemId
import typingsSlinky.reactMdTree.typesMod.TreeItemSorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNestedTreeListMod {
  
  @JSImport("@react-md/tree/types/useNestedTreeList", "buildTree")
  @js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "buildTree")
  @js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "buildTree")
  @js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "buildTree")
  @js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  
  @JSImport("@react-md/tree/types/useNestedTreeList", "useNestedTreeList")
  @js.native
  def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T]): js.Array[NestedTreeItem[T]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "useNestedTreeList")
  @js.native
  def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: js.UndefOr[scala.Nothing], rootId: TreeItemId): js.Array[NestedTreeItem[T]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "useNestedTreeList")
  @js.native
  def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T]): js.Array[NestedTreeItem[T]] = js.native
  @JSImport("@react-md/tree/types/useNestedTreeList", "useNestedTreeList")
  @js.native
  def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T], rootId: TreeItemId): js.Array[NestedTreeItem[T]] = js.native
  
  type NestedTreeItem[T /* <: BaseTreeItem */] = T with ChildItems
}
