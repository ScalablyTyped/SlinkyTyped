package typingsSlinky.graphqlTools.filterTypesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterTypes extends Transform {
  var filter: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MFilterTypes(schema: GraphQLSchema): GraphQLSchema = js.native
}

object FilterTypes {
  @scala.inline
  def apply(filter: js.Any, transformSchema: GraphQLSchema => GraphQLSchema): FilterTypes = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[FilterTypes]
  }
  @scala.inline
  implicit class FilterTypesOps[Self <: FilterTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
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

