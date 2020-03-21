package typingsSlinky.domHelpers

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/getComputedStyle", JSImport.Namespace)
@js.native
object getComputedStyleMod extends js.Object {
  def default(node: HTMLElement): CSSStyleDeclaration = js.native
  def default(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = js.native
}

