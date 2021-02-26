package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsEditableTool extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object DiagramConnectionDefaultsEditableTool {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsEditableTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEditableTool]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsEditableToolMutableBuilder[Self <: DiagramConnectionDefaultsEditableTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
