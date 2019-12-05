package typingsSlinky.graphqlDashTools.distTransformsReplaceFieldWithFragmentMod

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.distInterfacesMod.Request
import typingsSlinky.graphqlDashTools.distInterfacesMod.Result
import typingsSlinky.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceFieldWithFragment extends Transform {
  var mapping: js.Any
  var targetSchema: js.Any
  @JSName("transformRequest")
  def transformRequest_MReplaceFieldWithFragment(originalRequest: Request): Request
}

object ReplaceFieldWithFragment {
  @scala.inline
  def apply(
    mapping: js.Any,
    targetSchema: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): ReplaceFieldWithFragment = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ReplaceFieldWithFragment]
  }
}

