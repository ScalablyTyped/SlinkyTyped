package typingsSlinky.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "buildResolveInfo")
@js.native
object buildResolveInfo extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[_, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path
  ): GraphQLResolveInfo = js.native
}

