package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "forwardArgsToSelectionSet")
@js.native
object forwardArgsToSelectionSet extends js.Object {
  def apply(selectionSet: String): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def apply(selectionSet: String, mapping: Record[String, js.Array[String]]): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
}

