package typingsSlinky.graphqlToolsGraphqlFileLoader.mod

import typingsSlinky.graphqlToolsGraphqlFileLoader.anon.Document
import typingsSlinky.graphqlToolsGraphqlFileLoader.anon.Location
import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/graphql-file-loader", "GraphQLFileLoader")
@js.native
class GraphQLFileLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, GraphQLFileLoaderOptions] {
  
  @JSName("canLoadSync")
  def canLoadSync_MGraphQLFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: GraphQLFileLoaderOptions): Boolean = js.native
  
  def handleFileContent(rawSDL: String, pointer: String, options: GraphQLFileLoaderOptions): Document | Location = js.native
  
  @JSName("loadSync")
  def loadSync_MGraphQLFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: GraphQLFileLoaderOptions): Source = js.native
}
