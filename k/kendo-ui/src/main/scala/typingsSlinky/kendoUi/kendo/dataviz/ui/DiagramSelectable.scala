package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramSelectable extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var stroke: js.UndefOr[DiagramSelectableStroke] = js.native
}
object DiagramSelectable {
  
  @scala.inline
  def apply(): DiagramSelectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramSelectable]
  }
  
  @scala.inline
  implicit class DiagramSelectableMutableBuilder[Self <: DiagramSelectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramSelectableStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
