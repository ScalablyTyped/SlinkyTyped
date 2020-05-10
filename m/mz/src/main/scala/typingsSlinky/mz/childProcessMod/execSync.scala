package typingsSlinky.mz.childProcessMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ExecSyncOptions
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "execSync")
@js.native
object execSync extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
}

