package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphqlToolsUtils.transformInputValueMod.InputValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "transformInputValue")
@js.native
object transformInputValue extends js.Object {
  def apply(`type`: GraphQLInputType, value: js.Any, transformer: InputValueTransformer): js.Any = js.native
}

