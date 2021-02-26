package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElementData extends StObject {
  
  var componentElement: org.scalajs.dom.raw.Element = js.native
  
  var data: js.Object = js.native
}
object ComponentElementData {
  
  @scala.inline
  def apply(componentElement: org.scalajs.dom.raw.Element, data: js.Object): ComponentElementData = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementData]
  }
  
  @scala.inline
  implicit class ComponentElementDataMutableBuilder[Self <: ComponentElementData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
