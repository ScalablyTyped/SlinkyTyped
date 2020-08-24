package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.visitResultMod.ErrorVisitorMap
import typingsSlinky.graphqlToolsUtils.visitResultMod.ResultVisitorMap
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "visitResult")
@js.native
object visitResult extends js.Object {
  def apply(result: ExecutionResult[Record[String, _]], request: Request, schema: GraphQLSchema): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: js.UndefOr[scala.Nothing],
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap
  ): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap,
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
}

