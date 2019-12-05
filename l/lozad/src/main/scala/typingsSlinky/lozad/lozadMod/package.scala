package typingsSlinky.lozad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lozadMod {
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Node
  import org.scalajs.dom.raw.NodeListOf
  import typingsSlinky.std.HTMLCollectionOf

  type Selector = String | Element | HTMLCollectionOf[Element] | (NodeListOf[Element with Node])
}
