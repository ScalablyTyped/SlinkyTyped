package typingsSlinky.dojo.dojox.NodeList.delegate

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Places the content after every node in the NodeList.
  * The content will be cloned if the length of NodeList
  * is greater than 1. Only the DOM nodes are cloned, not
  * any attached event handlers.
  *
  * @param content
  */
@js.native
trait after extends js.Object {
  def apply(content: String): js.Any = js.native
  def apply(content: HTMLElement): js.Any = js.native
  def apply(content: NodeList): js.Any = js.native
}

