package typingsSlinky.actionsOnGoogle.assistantMod

import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceBaseApp extends js.Object {
  
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
  /** @public */
  @JSName("handler")
  var handler_Original: StandardHandler = js.native
}
