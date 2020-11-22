package typingsSlinky.htmlCodesniffer.mod.Util

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.style")
@js.native
object style extends js.Object {
  
  /**
    * Return the appropriate computed style object for an element.
    *
    * It's accessed in different ways depending on whether it's IE or not.
    *
    * @param element An element with style.
    */
  def apply(element: Element): CSSStyleDeclaration = js.native
  def apply(element: Element, pseudo: String): CSSStyleDeclaration = js.native
}
