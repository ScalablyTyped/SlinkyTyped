package typingsSlinky.graphqlDashTools.distTransformsFilterRootFieldsMod

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.distInterfacesMod.Request
import typingsSlinky.graphqlDashTools.distInterfacesMod.Result
import typingsSlinky.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterRootFields extends Transform {
  var transformer: js.Any
  @JSName("transformSchema")
  def transformSchema_MFilterRootFields(originalSchema: GraphQLSchema): GraphQLSchema
}

object FilterRootFields {
  @scala.inline
  def apply(
    transformSchema: GraphQLSchema => GraphQLSchema,
    transformer: js.Any,
    transformRequest: /* originalRequest */ Request => Request = null,
    transformResult: /* result */ Result => Result = null
  ): FilterRootFields = {
    val __obj = js.Dynamic.literal(transformSchema = js.Any.fromFunction1(transformSchema), transformer = transformer.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[FilterRootFields]
  }
}

