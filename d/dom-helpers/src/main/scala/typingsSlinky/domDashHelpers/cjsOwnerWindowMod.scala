package typingsSlinky.domDashHelpers

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/ownerWindow", JSImport.Namespace)
@js.native
object cjsOwnerWindowMod extends js.Object {
  def default(): Window = js.native
  def default(node: Element): Window = js.native
}

