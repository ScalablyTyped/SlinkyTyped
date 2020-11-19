package typingsSlinky.domHelpers

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.domHelpers.domHelpersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object isWindowMod extends js.Object {
  
  def default(node: Document): Window | `false` = js.native
  def default(node: Element): Window | `false` = js.native
  def default(node: Window): Window | `false` = js.native
}
