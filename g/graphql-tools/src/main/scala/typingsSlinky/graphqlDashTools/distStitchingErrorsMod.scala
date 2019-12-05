package typingsSlinky.graphqlDashTools

import typingsSlinky.graphql.errorFormatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.executionExecuteMod.ExecutionResult
import typingsSlinky.graphql.executionExecuteMod.ExecutionResultDataDefault
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/errors", JSImport.Namespace)
@js.native
object distStitchingErrorsMod extends js.Object {
  var ERROR_SYMBOL: js.Any = js.native
  def annotateWithChildrenErrors(`object`: js.Any, childrenErrors: js.Array[GraphQLFormattedError[Record[String, _]]]): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo, responseKey: String): js.Any = js.native
  def getErrorsFromParent(`object`: js.Any, fieldName: String): Anon_Error | Anon_CHILDREN = js.native
}

