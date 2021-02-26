package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
}
object TableRowProps {
  
  @scala.inline
  def apply(): TableRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProps]
  }
  
  @scala.inline
  implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
