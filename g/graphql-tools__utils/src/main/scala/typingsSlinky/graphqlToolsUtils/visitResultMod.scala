package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.anon.Enter
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/visitResult", JSImport.Namespace)
@js.native
object visitResultMod extends js.Object {
  
  def visitData(data: js.Any): js.Any = js.native
  def visitData(data: js.Any, enter: js.UndefOr[scala.Nothing], leave: ValueVisitor): js.Any = js.native
  def visitData(data: js.Any, enter: ValueVisitor): js.Any = js.native
  def visitData(data: js.Any, enter: ValueVisitor, leave: ValueVisitor): js.Any = js.native
  
  def visitErrors(errors: js.Array[GraphQLError], visitor: js.Function1[/* error */ GraphQLError, GraphQLError]): js.Array[GraphQLError] = js.native
  
  def visitResult(result: ExecutionResult[Record[String, _]], request: Request, schema: GraphQLSchema): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: js.UndefOr[scala.Nothing],
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap
  ): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap,
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  
  type ErrorVisitor = js.Function2[/* error */ GraphQLError, /* pathIndex */ Double, GraphQLError]
  
  type ErrorVisitorMap = Record[String, Record[String, ErrorVisitor]]
  
  type ObjectValueVisitor = Enter with (Record[String, ValueVisitor])
  
  type ResultVisitorMap = Record[String, ValueVisitor | ObjectValueVisitor]
  
  type ValueVisitor = js.Function1[/* value */ js.Any, js.Any]
}
