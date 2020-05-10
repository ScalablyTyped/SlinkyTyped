package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFieldObjectType extends js.Object {
  var field: GraphQLField[_, _, StringDictionary[_]] = js.native
  var objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType = js.native
}

object AnonFieldObjectType {
  @scala.inline
  def apply(
    field: GraphQLField[_, _, StringDictionary[_]],
    objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
  ): AnonFieldObjectType = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldObjectType]
  }
  @scala.inline
  implicit class AnonFieldObjectTypeOps[Self <: AnonFieldObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: GraphQLField[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

