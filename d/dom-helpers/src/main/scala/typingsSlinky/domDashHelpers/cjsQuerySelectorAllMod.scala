package typingsSlinky.domDashHelpers

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/querySelectorAll", JSImport.Namespace)
@js.native
object cjsQuerySelectorAllMod extends js.Object {
  def default(element: Document, selector: String): js.Array[HTMLElement] = js.native
  def default(element: typingsSlinky.std.HTMLElement, selector: String): js.Array[HTMLElement] = js.native
}

