package typingsSlinky.reactMdTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ExpandedIds = js.Array[typingsSlinky.reactMdTree.typesMod.TreeItemId]
  
  type GetItemProps[T /* <: typingsSlinky.reactMdTree.typesMod.TreeItemIds */] = js.Function1[
    /* item */ T with typingsSlinky.reactMdTree.typesMod.TreeItemStates, 
    js.UndefOr[typingsSlinky.reactMdTree.typesMod.ConfigurableTreeItemProps]
  ]
  
  type SelectedIds = js.Array[typingsSlinky.reactMdTree.typesMod.TreeItemId]
  
  type TreeData[T /* <: typingsSlinky.reactMdTree.typesMod.BaseTreeItem */] = typingsSlinky.std.Record[typingsSlinky.reactMdTree.typesMod.TreeItemId, T]
  
  type TreeItemId = java.lang.String
  
  type TreeItemRenderer[T /* <: typingsSlinky.reactMdTree.typesMod.BaseTreeItem */] = js.Function3[
    /* providedProps */ typingsSlinky.reactMdTree.typesMod.ProvidedTreeItemProps, 
    /* item */ T with typingsSlinky.reactMdTree.anon.VisibleIndex, 
    /* treeProps */ typingsSlinky.reactMdTree.typesMod.ProvidedTreeProps, 
    slinky.core.facade.ReactElement | scala.Null
  ]
  
  type TreeItemSorter[T /* <: typingsSlinky.reactMdTree.typesMod.BaseTreeItem */] = js.Function1[/* items */ js.Array[T], js.Array[T]]
}
