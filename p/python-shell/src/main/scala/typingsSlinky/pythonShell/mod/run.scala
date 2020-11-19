package typingsSlinky.pythonShell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("python-shell", "run")
@js.native
object run extends js.Object {
  
  def apply(
    scriptName: String,
    RunOptions: RunOptions,
    callback: js.Function2[/* err */ js.Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def apply(
    scriptName: String,
    callback: js.Function2[/* err */ js.Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}
