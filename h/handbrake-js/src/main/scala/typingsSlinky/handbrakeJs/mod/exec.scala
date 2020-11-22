package typingsSlinky.handbrakeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("handbrake-js", "exec")
@js.native
object exec extends js.Object {
  
  def apply(options: HandbrakeOptions): Unit = js.native
  def apply(
    options: HandbrakeOptions,
    cb: js.Function3[/* err */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): Unit = js.native
}
