package typingsSlinky.graphqlTools.filterRootFieldsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRootFields extends Transform {
  var transformer: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MFilterRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object FilterRootFields {
  @scala.inline
  def apply(transformSchema: GraphQLSchema => GraphQLSchema, transformer: js.Any): FilterRootFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRootFields]
  }
  @scala.inline
  implicit class FilterRootFieldsOps[Self <: FilterRootFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

