package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/parse-graphql-json", JSImport.Namespace)
@js.native
object parseGraphqlJsonMod extends js.Object {
  def parseGraphQLJSON(
    location: String,
    jsonContent: String,
    options: SchemaPrintOptions with ParseOptions with GraphQLSchemaValidationOptions
  ): Source = js.native
}

