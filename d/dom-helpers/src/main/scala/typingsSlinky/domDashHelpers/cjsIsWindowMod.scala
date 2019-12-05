package typingsSlinky.domDashHelpers

import org.scalajs.dom.raw.Window
import typingsSlinky.domDashHelpers.domDashHelpersNumbers.`false`
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
@js.native
object cjsIsWindowMod extends js.Object {
  def default(node: Document): Window | `false` = js.native
  def default(node: Element): Window | `false` = js.native
  def default(node: typingsSlinky.std.Window): Window | `false` = js.native
}

