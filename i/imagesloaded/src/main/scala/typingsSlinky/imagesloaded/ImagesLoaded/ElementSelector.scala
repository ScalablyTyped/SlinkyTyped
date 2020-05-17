package typingsSlinky.imagesloaded.ImagesLoaded

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - typingsSlinky.std.NodeList
  - js.Array[typingsSlinky.std.Element]
  - java.lang.String
*/
trait ElementSelector extends js.Object

object ElementSelector {
  @scala.inline
  implicit def apply(value: js.Array[Element]): ElementSelector = value.asInstanceOf[ElementSelector]
  @scala.inline
  implicit def apply(value: Element): ElementSelector = value.asInstanceOf[ElementSelector]
  @scala.inline
  implicit def apply(value: NodeList): ElementSelector = value.asInstanceOf[ElementSelector]
  @scala.inline
  implicit def apply(value: String): ElementSelector = value.asInstanceOf[ElementSelector]
}

