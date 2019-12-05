package typingsSlinky.prosemirrorDashSchemaDashList

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.orderedmap.orderedmapMod.^
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.NodeSpec
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-schema-list", JSImport.Namespace)
@js.native
object prosemirrorDashSchemaDashListMod extends js.Object {
  var bulletList: NodeSpec = js.native
  var listItem: NodeSpec = js.native
  var orderedList: NodeSpec = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String): ^[NodeSpec] = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String, listGroup: String): ^[NodeSpec] = js.native
  def liftListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
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

