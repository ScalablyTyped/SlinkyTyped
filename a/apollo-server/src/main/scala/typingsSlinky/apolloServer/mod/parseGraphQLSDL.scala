package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphqlToolsUtils.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "parseGraphQLSDL")
@js.native
object parseGraphQLSDL extends js.Object {
  def apply(location: String, rawSDL: String, options: ParseOptions): Document = js.native
}

