package typingsSlinky.reactVirtualized.esTableMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeaderRowProps extends StObject {
  
  var className: String = js.native
  
  var columns: js.Array[ReactElement] = js.native
  
  var height: Double = js.native
  
  var scrollbarWidth: Double = js.native
  
  var style: CSSProperties = js.native
  
  var width: Double = js.native
}
object TableHeaderRowProps {
  
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[ReactElement],
    height: Double,
    scrollbarWidth: Double,
    style: CSSProperties,
    width: Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderRowProps]
  }
  
  @scala.inline
  implicit class TableHeaderRowPropsMutableBuilder[Self <: TableHeaderRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: js.Array[ReactElement]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ReactElement*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
