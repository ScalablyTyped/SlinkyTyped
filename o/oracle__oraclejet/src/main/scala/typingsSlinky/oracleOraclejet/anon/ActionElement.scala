package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionElement
  extends /* key */ StringDictionary[js.Any] {
  
  var action: open | close = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  def endCallback(): Unit = js.native
}
object ActionElement {
  
  @scala.inline
  def apply(action: open | close, element: org.scalajs.dom.raw.Element, endCallback: () => Unit): ActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    __obj.asInstanceOf[ActionElement]
  }
  
  @scala.inline
  implicit class ActionElementMutableBuilder[Self <: ActionElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: open | close): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: () => Unit): Self = StObject.set(x, "endCallback", js.Any.fromFunction0(value))
  }
}
