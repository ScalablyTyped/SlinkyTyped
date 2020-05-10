package typingsSlinky.graphqlTools

import typingsSlinky.graphql.mod.GraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObjectTypeGraphQLInputObjectType extends js.Object {
  var objectType: GraphQLInputObjectType = js.native
}

object AnonObjectTypeGraphQLInputObjectType {
  @scala.inline
  def apply(objectType: GraphQLInputObjectType): AnonObjectTypeGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectTypeGraphQLInputObjectType]
  }
  @scala.inline
  implicit class AnonObjectTypeGraphQLInputObjectTypeOps[Self <: AnonObjectTypeGraphQLInputObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectType(value: GraphQLInputObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

