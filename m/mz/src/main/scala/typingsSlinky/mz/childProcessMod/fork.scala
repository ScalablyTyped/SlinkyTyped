package typingsSlinky.mz.childProcessMod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/child_process", "fork")
@js.native
object fork extends js.Object {
  
  def apply(modulePath: String): ChildProcess = js.native
  def apply(modulePath: String, args: js.UndefOr[scala.Nothing], options: ForkOptions): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String], options: ForkOptions): ChildProcess = js.native
  def apply(modulePath: String, options: ForkOptions): ChildProcess = js.native
}
