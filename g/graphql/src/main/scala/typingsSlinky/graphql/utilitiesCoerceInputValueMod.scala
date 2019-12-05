package typingsSlinky.graphql

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.graphql.utilitiesCoerceInputValueMod.OnErrorCB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceInputValue", JSImport.Namespace)
@js.native
object utilitiesCoerceInputValueMod extends js.Object {
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  type OnErrorCB = js.Function3[
    /* path */ js.Array[String | Double], 
    /* invalidValue */ js.Any, 
    /* error */ GraphQLError, 
    Unit
  ]
}

