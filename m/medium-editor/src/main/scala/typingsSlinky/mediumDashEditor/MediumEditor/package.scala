package typingsSlinky.mediumDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MediumEditor {
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.HTMLCollection
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.Node
  import org.scalajs.dom.raw.NodeList
  import org.scalajs.dom.raw.NodeListOf

  type Button = String | ButtonOptions
  type elementType = String | HTMLElement | js.Array[HTMLElement] | NodeList | (NodeListOf[Element with Node]) | HTMLCollection
}
