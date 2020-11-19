package typingsSlinky.graphqlToolsStitch

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/stitch/selectionSetArgs", JSImport.Namespace)
@js.native
object selectionSetArgsMod extends js.Object {
  
  def forwardArgsToSelectionSet(selectionSet: String): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def forwardArgsToSelectionSet(selectionSet: String, mapping: Record[String, js.Array[String]]): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
}
