package typingsSlinky.prosemirrorSchemaList

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.mod.NodeSpec
import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-schema-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-schema-list", "addListNodes")
  @js.native
  def addListNodes(nodes: typingsSlinky.orderedmap.mod.^[NodeSpec], itemContent: String): typingsSlinky.orderedmap.mod.^[NodeSpec] = js.native
  @JSImport("prosemirror-schema-list", "addListNodes")
  @js.native
  def addListNodes(nodes: typingsSlinky.orderedmap.mod.^[NodeSpec], itemContent: String, listGroup: String): typingsSlinky.orderedmap.mod.^[NodeSpec] = js.native
  
  @JSImport("prosemirror-schema-list", "bulletList")
  @js.native
  def bulletList: NodeSpec = js.native
  @scala.inline
  def bulletList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bulletList")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-schema-list", "liftListItem")
  @js.native
  def liftListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-schema-list", "listItem")
  @js.native
  def listItem: NodeSpec = js.native
  @scala.inline
  def listItem_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-schema-list", "orderedList")
  @js.native
  def orderedList: NodeSpec = js.native
  @scala.inline
  def orderedList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orderedList")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-schema-list", "sinkListItem")
  @js.native
  def sinkListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-schema-list", "splitListItem")
  @js.native
  def splitListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-schema-list", "wrapInList")
  @js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-schema-list", "wrapInList")
  @js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}
