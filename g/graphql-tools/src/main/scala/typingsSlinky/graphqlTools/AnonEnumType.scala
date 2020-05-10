package typingsSlinky.graphqlTools

import typingsSlinky.graphql.mod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumType extends js.Object {
  var enumType: GraphQLEnumType = js.native
}

object AnonEnumType {
  @scala.inline
  def apply(enumType: GraphQLEnumType): AnonEnumType = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumType]
  }
  @scala.inline
  implicit class AnonEnumTypeOps[Self <: AnonEnumType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumType(value: GraphQLEnumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

