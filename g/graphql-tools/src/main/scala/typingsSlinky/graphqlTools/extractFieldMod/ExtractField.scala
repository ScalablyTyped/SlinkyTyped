package typingsSlinky.graphqlTools.extractFieldMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Result
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractField extends Transform {
  var from: js.Any
  var to: js.Any
  @JSName("transformRequest")
  def transformRequest_MExtractField(originalRequest: Request): Request
}

object ExtractField {
  @scala.inline
  def apply(
    from: js.Any,
    to: js.Any,
    transformRequest: Request => Request,
    transformResult: /* result */ Result => Result = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): ExtractField = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    if (transformResult != null) __obj.updateDynamic("transformResult")(js.Any.fromFunction1(transformResult))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[ExtractField]
  }
}

