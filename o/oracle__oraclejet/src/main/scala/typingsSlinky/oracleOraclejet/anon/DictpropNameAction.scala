package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameAction
  extends /* key */ StringDictionary[js.Any] {
  
  var action: open | close = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
}
object DictpropNameAction {
  
  @scala.inline
  def apply(action: open | close, element: org.scalajs.dom.raw.Element): DictpropNameAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameAction]
  }
  
  @scala.inline
  implicit class DictpropNameActionMutableBuilder[Self <: DictpropNameAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: open | close): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
