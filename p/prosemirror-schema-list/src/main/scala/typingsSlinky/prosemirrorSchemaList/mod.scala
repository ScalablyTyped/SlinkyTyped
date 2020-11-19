package typingsSlinky.prosemirrorSchemaList

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.orderedmap.mod.^
import typingsSlinky.prosemirrorModel.mod.NodeSpec
import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-schema-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addListNodes(nodes: ^[NodeSpec], itemContent: String): ^[NodeSpec] = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String, listGroup: String): ^[NodeSpec] = js.native
  
  var bulletList: NodeSpec = js.native
  
  def liftListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  var listItem: NodeSpec = js.native
  
  var orderedList: NodeSpec = js.native
  
  def sinkListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  def splitListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}
