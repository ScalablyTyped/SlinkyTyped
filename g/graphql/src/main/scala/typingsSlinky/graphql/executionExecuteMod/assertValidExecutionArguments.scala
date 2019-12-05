package typingsSlinky.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "assertValidExecutionArguments")
@js.native
object assertValidExecutionArguments extends js.Object {
  def apply(schema: GraphQLSchema, document: DocumentNode, rawVariableValues: Maybe[StringDictionary[_]]): Unit = js.native
}

