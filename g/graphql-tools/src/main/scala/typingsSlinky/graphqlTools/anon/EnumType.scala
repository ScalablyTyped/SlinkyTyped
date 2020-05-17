package typingsSlinky.graphqlTools.anon

import typingsSlinky.graphql.mod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumType extends js.Object {
  var enumType: GraphQLEnumType = js.native
}

object EnumType {
  @scala.inline
  def apply(enumType: GraphQLEnumType): EnumType = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
  @scala.inline
  implicit class EnumTypeOps[Self <: EnumType] (val x: Self) extends AnyVal {
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

