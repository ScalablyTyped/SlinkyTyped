package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageParserMod.ParseOptions
import typingsSlinky.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(source: typingsSlinky.graphql.languageSourceMod.Source): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(
    source: typingsSlinky.graphql.languageSourceMod.Source,
    options: BuildSchemaOptions with ParseOptions
  ): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
}

