package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "fixSchemaAst")
@js.native
object fixSchemaAst extends js.Object {
  
  def apply(schema: GraphQLSchema, options: BuildSchemaOptions with SchemaPrintOptions): GraphQLSchema = js.native
}
