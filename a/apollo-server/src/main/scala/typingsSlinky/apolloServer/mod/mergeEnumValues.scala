package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "mergeEnumValues")
@js.native
object mergeEnumValues extends js.Object {
  def apply(
    first: js.Array[EnumValueDefinitionNode],
    second: js.Array[EnumValueDefinitionNode],
    config: Config
  ): js.Array[EnumValueDefinitionNode] = js.native
}

