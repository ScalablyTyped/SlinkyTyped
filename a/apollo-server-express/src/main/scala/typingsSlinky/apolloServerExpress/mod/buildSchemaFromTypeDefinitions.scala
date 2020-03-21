package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "buildSchemaFromTypeDefinitions")
@js.native
object buildSchemaFromTypeDefinitions extends js.Object {
  def apply(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def apply(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
}

