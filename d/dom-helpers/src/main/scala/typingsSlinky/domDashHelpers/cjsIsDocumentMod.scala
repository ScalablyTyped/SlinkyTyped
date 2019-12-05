package typingsSlinky.domDashHelpers

import typingsSlinky.std.Document
import typingsSlinky.std.Element
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isDocument", JSImport.Namespace)
@js.native
object cjsIsDocumentMod extends js.Object {
  def default(element: Document): /* is std.Document */ Boolean = js.native
  def default(element: Element): /* is std.Document */ Boolean = js.native
  def default(element: Window): /* is std.Document */ Boolean = js.native
}

