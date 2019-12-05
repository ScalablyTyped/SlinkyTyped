package typingsSlinky.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.jsutilsPathMod.Path
import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
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

