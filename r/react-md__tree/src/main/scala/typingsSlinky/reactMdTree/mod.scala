package typingsSlinky.reactMdTree

import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdList.listMod.ListElement
import typingsSlinky.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typingsSlinky.reactMdTree.anon.PickTreeGroupPropshiddenc
import typingsSlinky.reactMdTree.anon.RequiredTreeItemSelection
import typingsSlinky.reactMdTree.typesMod.BaseTreeItem
import typingsSlinky.reactMdTree.typesMod.ExpandedIds
import typingsSlinky.reactMdTree.typesMod.ProvidedTreeItemProps
import typingsSlinky.reactMdTree.typesMod.ProvidedTreeProps
import typingsSlinky.reactMdTree.typesMod.SelectedIds
import typingsSlinky.reactMdTree.typesMod.TreeData
import typingsSlinky.reactMdTree.typesMod.TreeItemExpansion
import typingsSlinky.reactMdTree.typesMod.TreeItemId
import typingsSlinky.reactMdTree.typesMod.TreeItemProps
import typingsSlinky.reactMdTree.typesMod.TreeItemWithContentComponentProps
import typingsSlinky.reactMdTree.typesMod.TreeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tree", "Tree")
  @js.native
  val Tree: ForwardRefExoticComponent[TreeProps[_] with RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/tree", "TreeGroup")
  @js.native
  val TreeGroup: ForwardRefExoticComponent[PickTreeGroupPropshiddenc] = js.native
  
  @JSImport("@react-md/tree", "TreeItem")
  @js.native
  val TreeItem: ForwardRefExoticComponent[
    (TreeItemProps with RefAttributes[HTMLLIElement]) | (TreeItemWithContentComponentProps with RefAttributes[HTMLLIElement])
  ] = js.native
  
  @JSImport("@react-md/tree", "defaultTreeItemRenderer")
  @js.native
  def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): ReactElement = js.native
  
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getChildItems")
  @js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  
  @JSImport("@react-md/tree", "getItemsFrom")
  @js.native
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  @JSImport("@react-md/tree", "getItemsFrom")
  @js.native
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = js.native
  
  @JSImport("@react-md/tree", "useTreeItemExpansion")
  @js.native
  def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = js.native
  @JSImport("@react-md/tree", "useTreeItemExpansion")
  @js.native
  def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = js.native
  
  @JSImport("@react-md/tree", "useTreeItemSelection")
  @js.native
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = js.native
  @JSImport("@react-md/tree", "useTreeItemSelection")
  @js.native
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = js.native
  @JSImport("@react-md/tree", "useTreeItemSelection")
  @js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = js.native
  @JSImport("@react-md/tree", "useTreeItemSelection")
  @js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = js.native
}
