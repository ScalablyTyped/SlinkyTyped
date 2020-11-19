package typingsSlinky.graphql.buildASTSchemaMod

import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/utilities/buildASTSchema", "buildSchema")
@js.native
object buildSchema extends js.Object {
  
  def apply(source: String): GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def apply(source: Source): GraphQLSchema = js.native
  def apply(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
}
