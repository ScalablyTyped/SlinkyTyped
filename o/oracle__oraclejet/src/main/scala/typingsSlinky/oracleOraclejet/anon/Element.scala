package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element
  extends /* key */ StringDictionary[js.Any] {
  
  var action: String = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  def endCallback(): Unit = js.native
}
object Element {
  
  @scala.inline
  def apply(action: String, element: org.scalajs.dom.raw.Element, endCallback: () => Unit): Element = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: () => Unit): Self = StObject.set(x, "endCallback", js.Any.fromFunction0(value))
  }
}
