package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends StObject {
  
  var borderStyle: js.UndefOr[sm | none] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var maxHeight: js.UndefOr[number | string] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyle(value: sm | none): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: number | string): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
  }
}
