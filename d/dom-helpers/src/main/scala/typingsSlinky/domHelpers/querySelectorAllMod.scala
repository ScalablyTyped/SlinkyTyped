package typingsSlinky.domHelpers

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/querySelectorAll", JSImport.Namespace)
@js.native
object querySelectorAllMod extends js.Object {
  def default(element: Document, selector: String): js.Array[HTMLElement] = js.native
  def default(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
}

