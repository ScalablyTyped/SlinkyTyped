package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "graphql.buildSchema")
@js.native
object buildSchema extends js.Object {
  
  def apply(source: String): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
}
