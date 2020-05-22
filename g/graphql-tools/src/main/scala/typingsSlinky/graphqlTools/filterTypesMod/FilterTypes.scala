package typingsSlinky.graphqlTools.filterTypesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Result
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTypes extends Transform {
  var filter: js.Any
  @JSName("transformSchema")
  def transformSchema_MFilterTypes(schema: GraphQLSchema): GraphQLSchema
}

object FilterTypes {
  @scala.inline
  def apply(
    filter: js.Any,
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null
  ): FilterTypes = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[FilterTypes]
  }
}

