package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "buildDocumentFromTypeDefinitions")
@js.native
object buildDocumentFromTypeDefinitions extends js.Object {
  def apply(typeDefinitions: ITypeDefinitions): DocumentNode = js.native
  def apply(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): DocumentNode = js.native
}

