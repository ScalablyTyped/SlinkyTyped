package typingsSlinky.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "collectFields")
@js.native
object collectFields extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    runtimeType: GraphQLObjectType[_, _, StringDictionary[_]],
    selectionSet: SelectionSetNode,
    fields: StringDictionary[js.Array[FieldNode]],
    visitedFragmentNames: StringDictionary[Boolean]
  ): StringDictionary[js.Array[FieldNode]] = js.native
}

