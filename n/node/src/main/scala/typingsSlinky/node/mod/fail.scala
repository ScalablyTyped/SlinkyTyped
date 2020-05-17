package typingsSlinky.node.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", "fail")
@js.native
object fail extends js.Object {
  def apply(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def apply(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: String, operator: String, stackStartFn: js.Function): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: js.Error): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: js.Error, operator: String): scala.Nothing = js.native
  def apply(actual: js.Any, expected: js.Any, message: js.Error, operator: String, stackStartFn: js.Function): scala.Nothing = js.native
  def apply(message: String): scala.Nothing = js.native
  def apply(message: js.Error): scala.Nothing = js.native
}

