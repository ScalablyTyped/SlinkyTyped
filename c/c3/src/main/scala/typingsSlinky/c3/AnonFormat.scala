package typingsSlinky.c3

import typingsSlinky.c3.mod.FormatFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormat extends js.Object {
  @JSName("format")
  var format_Original: FormatFunction = js.native
  def format(v: Double, id: String, i: Double, j: Double): String = js.native
  def format(v: AnonValueOf, id: String, i: Double, j: Double): String = js.native
}

