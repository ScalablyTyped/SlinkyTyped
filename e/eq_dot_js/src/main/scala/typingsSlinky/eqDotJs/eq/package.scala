package typingsSlinky.eqDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eq {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.NodeList
  import typingsSlinky.eqDotJs.JQuery
  import typingsSlinky.std.HTMLCollectionOf

  type AvailableElementType = HTMLElement | HTMLCollectionOf[Element] | js.Array[HTMLElement] | NodeList | JQuery
  type EqjsNodesTable = NumberDictionary[HTMLElement]
}
