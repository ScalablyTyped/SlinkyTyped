package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
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
  implicit class ActionElementOps[Self <: ActionElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: open | close): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: () => Unit): Self = this.set("endCallback", js.Any.fromFunction0(value))
  }
}
