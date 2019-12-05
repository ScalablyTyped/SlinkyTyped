package typingsSlinky.graphql

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/isValidLiteralValue", JSImport.Namespace)
@js.native
object utilitiesIsValidLiteralValueMod extends js.Object {
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[GraphQLError] = js.native
}

