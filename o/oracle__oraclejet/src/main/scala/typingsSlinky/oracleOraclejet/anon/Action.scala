package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action
  extends /* key */ StringDictionary[js.Any] {
  
  var action: String = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
}
object Action {
  
  @scala.inline
  def apply(action: String, element: org.scalajs.dom.raw.Element): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
