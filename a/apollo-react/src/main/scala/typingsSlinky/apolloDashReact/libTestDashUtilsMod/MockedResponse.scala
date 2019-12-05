package typingsSlinky.apolloDashReact.libTestDashUtilsMod

import typingsSlinky.typedDashGraphql.graphqlMod.GraphQLResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockedResponse extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[js.Error] = js.undefined
  var newData: js.UndefOr[js.Function0[_]] = js.undefined
  var request: ParsedRequest
  var result: js.UndefOr[GraphQLResult] = js.undefined
}

object MockedResponse {
  @scala.inline
  def apply(
    request: ParsedRequest,
    delay: Int | Double = null,
    error: js.Error = null,
    newData: () => _ = null,
    result: GraphQLResult = null
  ): MockedResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(js.Any.fromFunction0(newData))
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockedResponse]
  }
}

