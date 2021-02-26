package typingsSlinky.muiDatatables.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsBody extends StObject {
  
  def columnHeaderTooltip(column: MUIDataTableColumn): String = js.native
  
  var noMatch: String | ReactElement = js.native
  
  var toolTip: String = js.native
}
object MUIDataTableTextLabelsBody {
  
  @scala.inline
  def apply(columnHeaderTooltip: MUIDataTableColumn => String, toolTip: String): MUIDataTableTextLabelsBody = {
    val __obj = js.Dynamic.literal(columnHeaderTooltip = js.Any.fromFunction1(columnHeaderTooltip), toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsBody]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsBodyMutableBuilder[Self <: MUIDataTableTextLabelsBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaderTooltip(value: MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoMatch(value: String | ReactElement): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchReactElement(value: ReactElement): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
  }
}
