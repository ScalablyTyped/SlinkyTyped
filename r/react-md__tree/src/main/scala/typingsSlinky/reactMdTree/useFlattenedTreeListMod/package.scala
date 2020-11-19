package typingsSlinky.reactMdTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useFlattenedTreeListMod {
  
  type MetadataRecord = typingsSlinky.std.Record[
    typingsSlinky.reactMdTree.typesMod.TreeItemId, 
    typingsSlinky.reactMdTree.useFlattenedTreeListMod.ItemMetadata
  ]
  
  type ReturnValue = js.Tuple3[
    js.Array[typingsSlinky.reactMdTree.useFlattenedTreeListMod.SearchableTreeItem], 
    typingsSlinky.reactMdTree.useFlattenedTreeListMod.MetadataRecord, 
    js.Array[typingsSlinky.reactMdTree.useFlattenedTreeListMod.SearchableTreeItem]
  ]
  
  type TreeItemRef = typingsSlinky.react.mod.MutableRefObject[org.scalajs.dom.raw.HTMLLIElement | scala.Null]
}
