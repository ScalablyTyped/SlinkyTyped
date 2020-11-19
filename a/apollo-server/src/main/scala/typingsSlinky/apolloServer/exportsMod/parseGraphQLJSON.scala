package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "parseGraphQLJSON")
@js.native
object parseGraphQLJSON extends js.Object {
  
  def apply(
    location: String,
    jsonContent: String,
    options: SchemaPrintOptions with ParseOptions with GraphQLSchemaValidationOptions
  ): Source = js.native
}
