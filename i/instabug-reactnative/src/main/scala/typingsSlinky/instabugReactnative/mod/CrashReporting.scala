package typingsSlinky.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instabug-reactnative", "CrashReporting")
@js.native
object CrashReporting extends js.Object {
  
  def reportJSException(Exception: js.Object): Unit = js.native
  
  def setEnabled(isEnabled: Boolean): Unit = js.native
}
