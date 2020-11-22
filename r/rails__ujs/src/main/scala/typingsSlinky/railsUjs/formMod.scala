package typingsSlinky.railsUjs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs/utils/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  
  def formElements(form: Element, selector: String): js.Array[HTMLElement] = js.native
  
  def serializeElement(element: Element, additionalParam: js.Any): String = js.native
}
