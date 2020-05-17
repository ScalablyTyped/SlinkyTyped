package typingsSlinky.popmotion.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.stylefire.typesMod.Props
import typingsSlinky.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "styler")
@js.native
object styler extends js.Object {
  def apply(nodeOrSelector: String): Styler = js.native
  def apply(nodeOrSelector: String, props: Props): Styler = js.native
  def apply(nodeOrSelector: Element): Styler = js.native
  def apply(nodeOrSelector: Element, props: Props): Styler = js.native
  def apply(nodeOrSelector: Window): Styler = js.native
  def apply(nodeOrSelector: Window, props: Props): Styler = js.native
}

