package typingsSlinky.htmlCodesniffer.mod.Util

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getElementWindow")
@js.native
object getElementWindow extends js.Object {
  
  def apply(element: Document): Window = js.native
  /**
    * Get the window object relating to the passed element.
    *
    * @param element The element (or document) to pass.
    */
  def apply(element: Element): Window = js.native
}
