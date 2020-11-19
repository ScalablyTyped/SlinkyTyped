package typingsSlinky.openfin.mainMod

import typingsSlinky.openfin.contextMod.Context
import typingsSlinky.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "raiseIntent")
@js.native
object raiseIntent extends js.Object {
  
  def apply(intent: String, context: Context): js.Promise[IntentResolution] = js.native
  def apply(intent: String, context: Context, target: AppName): js.Promise[IntentResolution] = js.native
}
