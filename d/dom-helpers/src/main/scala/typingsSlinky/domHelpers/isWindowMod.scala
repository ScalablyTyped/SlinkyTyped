package typingsSlinky.domHelpers

import org.scalajs.dom.raw.Element
import typingsSlinky.domHelpers.domHelpersBooleans.`false`
import typingsSlinky.std.Document_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object isWindowMod extends js.Object {
  def default(node: Document_): Window_ | `false` = js.native
  def default(node: Element): Window_ | `false` = js.native
  def default(node: Window_): Window_ | `false` = js.native
}

