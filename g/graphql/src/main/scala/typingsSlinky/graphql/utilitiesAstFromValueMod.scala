package typingsSlinky.graphql

import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/astFromValue", JSImport.Namespace)
@js.native
object utilitiesAstFromValueMod extends js.Object {
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

