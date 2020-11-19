package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.add
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.remove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameActionElement
  extends /* key */ StringDictionary[js.Any] {
  
  var action: add | remove | update = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
}
object DictpropNameActionElement {
  
  @scala.inline
  def apply(action: add | remove | update, element: org.scalajs.dom.raw.Element): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameActionElement]
  }
  
  @scala.inline
  implicit class DictpropNameActionElementOps[Self <: DictpropNameActionElement] (val x: Self) extends AnyVal {
    
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
    def setAction(value: add | remove | update): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
