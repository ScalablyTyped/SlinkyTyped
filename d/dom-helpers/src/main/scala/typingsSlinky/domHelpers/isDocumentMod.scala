package typingsSlinky.domHelpers

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isDocument", JSImport.Namespace)
@js.native
object isDocumentMod extends js.Object {
  def default(element: Document): /* is std.Document */ Boolean = js.native
  def default(element: Element): /* is std.Document */ Boolean = js.native
  def default(element: Window): /* is std.Document */ Boolean = js.native
}

