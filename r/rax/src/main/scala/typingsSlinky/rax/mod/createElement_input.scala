package typingsSlinky.rax.mod

import typingsSlinky.rax.raxStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "createElement")
@js.native
object createElement_input extends js.Object {
  /**
    * ======================================================================
    * Rax Top Level API
    * ======================================================================
    */
  // DOM Elements
  // TODO: generalize this to everything in `keyof RaxHTML`, not just "input"
  def apply(`type`: input): DetailedRaxHTMLElement[
    InputHTMLAttributes[org.scalajs.dom.raw.HTMLElement], 
    org.scalajs.dom.raw.HTMLElement
  ] = js.native
  def apply(`type`: input, children: RaxNode*): DetailedRaxHTMLElement[
    InputHTMLAttributes[org.scalajs.dom.raw.HTMLElement], 
    org.scalajs.dom.raw.HTMLElement
  ] = js.native
  def apply(
    `type`: input,
    props: InputHTMLAttributes[org.scalajs.dom.raw.HTMLElement] with ClassAttributes[org.scalajs.dom.raw.HTMLElement],
    children: RaxNode*
  ): DetailedRaxHTMLElement[
    InputHTMLAttributes[org.scalajs.dom.raw.HTMLElement], 
    org.scalajs.dom.raw.HTMLElement
  ] = js.native
}

