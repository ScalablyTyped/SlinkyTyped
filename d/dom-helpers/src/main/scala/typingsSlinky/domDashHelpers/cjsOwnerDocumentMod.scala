package typingsSlinky.domDashHelpers

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/ownerDocument", JSImport.Namespace)
@js.native
object cjsOwnerDocumentMod extends js.Object {
  def default(): Document = js.native
  def default(node: Element): Document = js.native
}

