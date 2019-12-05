package typingsSlinky.keycode.keycodeMod

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycode extends js.Object {
  var aliases: AliasesMap = js.native
  var codes: CodesMap = js.native
  var names: InverseCodesMap = js.native
  def apply(event: Event): String = js.native
  def apply(keycode: Double): String = js.native
  def apply(name: String): Double = js.native
  def isEventKey(event: org.scalajs.dom.raw.Event, nameOrCode: String): Boolean = js.native
  def isEventKey(event: org.scalajs.dom.raw.Event, nameOrCode: Double): Boolean = js.native
}

