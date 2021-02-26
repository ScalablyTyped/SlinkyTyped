package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElement[K2] extends StObject {
  
  var componentElement: org.scalajs.dom.raw.Element = js.native
  
  var rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2] = js.native
}
object ComponentElement {
  
  @scala.inline
  def apply[K2](
    componentElement: org.scalajs.dom.raw.Element,
    rowData: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
  ): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
  
  @scala.inline
  implicit class ComponentElementMutableBuilder[Self <: ComponentElement[_], K2] (val x: Self with ComponentElement[K2]) extends AnyVal {
    
    @scala.inline
    def setComponentElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
