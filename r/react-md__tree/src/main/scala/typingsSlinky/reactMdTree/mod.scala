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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Tree: ForwardRefExoticComponent[TreeProps[_] with RefAttributes[ListElement]] = js.native
  
  val TreeGroup: ForwardRefExoticComponent[PickTreeGroupPropshiddenc] = js.native
  
  val TreeItem: ForwardRefExoticComponent[
    (TreeItemProps with RefAttributes[HTMLLIElement]) | (TreeItemWithContentComponentProps with RefAttributes[HTMLLIElement])
  ] = js.native
  
  def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): ReactElement = js.native
  
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = js.native
  def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = js.native
  
  def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = js.native
  def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = js.native
  
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = js.native
  def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = js.native
}
