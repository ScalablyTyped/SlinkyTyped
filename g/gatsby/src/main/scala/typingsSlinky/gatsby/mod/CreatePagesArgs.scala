package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePagesArgs extends ParentSpanPluginArgs {
  var traceId: String = js.native
  var waitForCascadingActions: Boolean = js.native
  def graphql[TData, TVariables](query: String): js.Promise[AnonErrors[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[AnonErrors[TData]] = js.native
}

