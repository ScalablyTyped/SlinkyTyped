package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
}

