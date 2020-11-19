package typingsSlinky.imagemagick.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imagemagick", "convert")
@js.native
object convert extends js.Object {
  
  def apply(args: js.Any, callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def apply(
    args: js.Any,
    timeout: Double,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): ChildProcess = js.native
  
  var path: String = js.native
}
