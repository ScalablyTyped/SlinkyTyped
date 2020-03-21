package typingsSlinky.opener

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opener", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(args: String): ChildProcess = js.native
  def apply(args: String, options: js.Object): ChildProcess = js.native
  def apply(args: String, options: js.Object, callback: Callback): ChildProcess = js.native
  def apply(args: js.Array[String]): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object, callback: Callback): ChildProcess = js.native
  type Callback = js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
}

