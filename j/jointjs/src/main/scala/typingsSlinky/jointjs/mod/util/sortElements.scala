package typingsSlinky.jointjs.mod.util

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "util.sortElements")
@js.native
object sortElements extends js.Object {
  
  def apply(elements: String, comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def apply(elements: js.Array[Element], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def apply(elements: JQuery[HTMLElement], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
}
