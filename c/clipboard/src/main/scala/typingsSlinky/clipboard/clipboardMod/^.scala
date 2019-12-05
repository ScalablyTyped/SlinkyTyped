package typingsSlinky.clipboard.clipboardMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboard", JSImport.Namespace)
@js.native
class ^ protected () extends ClipboardJS {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: NodeListOf[Element with Node]) = this()
  def this(selector: String, options: Options) = this()
  def this(selector: Element, options: Options) = this()
  def this(selector: NodeListOf[Element with Node], options: Options) = this()
}

@JSImport("clipboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Checks if clipboard.js is supported
    */
  def isSupported(): Boolean = js.native
}

