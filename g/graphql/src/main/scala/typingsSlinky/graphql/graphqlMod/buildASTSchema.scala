package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
}

