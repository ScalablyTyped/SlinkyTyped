package typingsSlinky.graphqlTools.convertEnumValuesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertEnumValues extends Transform {
  var enumValueMap: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MConvertEnumValues(schema: GraphQLSchema): GraphQLSchema = js.native
}

object ConvertEnumValues {
  @scala.inline
  def apply(enumValueMap: js.Any, transformSchema: GraphQLSchema => GraphQLSchema): ConvertEnumValues = {
    val __obj = js.Dynamic.literal(enumValueMap = enumValueMap.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ConvertEnumValues]
  }
  @scala.inline
  implicit class ConvertEnumValuesOps[Self <: ConvertEnumValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValueMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValueMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

