package typingsSlinky.listJs.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends js.Object {
  var elm: HTMLElement = js.native
  def hide(): Unit = js.native
  def matching(): Boolean = js.native
  def show(): Unit = js.native
  def values(): js.Object = js.native
  def values(newValues: js.Object): Unit = js.native
  def visible(): Boolean = js.native
}

