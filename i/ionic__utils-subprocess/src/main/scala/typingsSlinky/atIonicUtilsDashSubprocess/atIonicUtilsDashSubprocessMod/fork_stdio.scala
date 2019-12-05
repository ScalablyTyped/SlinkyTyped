package typingsSlinky.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod

import typingsSlinky.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessStrings.stdio
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.node.childUnderscoreProcessMod.ForkOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptions
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "fork")
@js.native
object fork_stdio extends js.Object {
  def apply(modulePath: String, args: js.Array[String], options: ForkOptions with (Pick[SpawnOptions, stdio])): ChildProcess = js.native
}

