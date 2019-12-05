package typingsSlinky.actionsDashOnDashGoogle.distAssistantMod

import typingsSlinky.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.StandardHandler
import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.StandardResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceBaseApp extends js.Object {
  /** @public */
  @JSName("handler")
  var handler_Original: StandardHandler = js.native
  /** @public */
  def handler(/** @public */
  body: JsonObject, /** @public */
  headers: Headers): js.Promise[StandardResponse] = js.native
  def handler(
    /** @public */
  body: JsonObject,
    /** @public */
  headers: Headers,
    /** @public */
  metadata: BuiltinFrameworkMetadata
  ): js.Promise[StandardResponse] = js.native
}

