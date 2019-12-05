package typingsSlinky.npmDashRun

import typingsSlinky.node.Buffer
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptions
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Command extends js.Object {
  def apply(command: String): Buffer = js.native
  def apply(command: String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
}

