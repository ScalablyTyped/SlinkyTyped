package typingsSlinky.patchConsole

import typingsSlinky.patchConsole.patchConsoleStrings.stderr
import typingsSlinky.patchConsole.patchConsoleStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("patch-console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(callback: Callback): Restore = js.native
  
  type Callback = js.Function2[/* stream */ stdout | stderr, /* data */ String, Unit]
  
  type Restore = js.Function0[Unit]
}
