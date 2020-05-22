package typingsSlinky.apolloServerPluginBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLRequestListenerExecutionDidEnd = (js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]) | scala.Unit
  type GraphQLRequestListenerParsingDidEnd = (js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]) | scala.Unit
  type GraphQLRequestListenerValidationDidEnd = (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], scala.Unit]) | scala.Unit
}
