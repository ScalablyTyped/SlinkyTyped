package typingsSlinky.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "assertValidExecutionArguments")
@js.native
object assertValidExecutionArguments extends js.Object {
  def apply(schema: GraphQLSchema, document: DocumentNode, rawVariableValues: Maybe[StringDictionary[_]]): Unit = js.native
}

