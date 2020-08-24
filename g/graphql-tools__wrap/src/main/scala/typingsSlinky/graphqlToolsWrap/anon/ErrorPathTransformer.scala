package typingsSlinky.graphqlToolsWrap.anon

import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphqlToolsWrap.transformQueryMod.QueryTransformer
import typingsSlinky.graphqlToolsWrap.transformQueryMod.ResultTransformer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorPathTransformer extends js.Object {
  var errorPathTransformer: js.UndefOr[typingsSlinky.graphqlToolsWrap.transformQueryMod.ErrorPathTransformer] = js.native
  var fragments: js.UndefOr[Record[String, FragmentDefinitionNode]] = js.native
  var path: js.Array[String] = js.native
  @JSName("queryTransformer")
  var queryTransformer_Original: QueryTransformer = js.native
  var resultTransformer: js.UndefOr[ResultTransformer] = js.native
  def queryTransformer(selectionSet: SelectionSetNode, fragments: Record[String, FragmentDefinitionNode]): SelectionSetNode = js.native
}

