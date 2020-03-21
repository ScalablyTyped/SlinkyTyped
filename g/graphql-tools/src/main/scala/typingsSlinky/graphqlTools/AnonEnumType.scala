package typingsSlinky.graphqlTools

import typingsSlinky.graphql.mod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnumType extends js.Object {
  var enumType: GraphQLEnumType
}

object AnonEnumType {
  @scala.inline
  def apply(enumType: GraphQLEnumType): AnonEnumType = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnumType]
  }
}

