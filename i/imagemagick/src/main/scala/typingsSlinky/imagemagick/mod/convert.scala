package typingsSlinky.imagemagick.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemagick", "convert")
@js.native
object convert extends js.Object {
  var path: String = js.native
  def apply(args: js.Any, callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  def apply(
    args: js.Any,
    timeout: Double,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): ChildProcess = js.native
}

