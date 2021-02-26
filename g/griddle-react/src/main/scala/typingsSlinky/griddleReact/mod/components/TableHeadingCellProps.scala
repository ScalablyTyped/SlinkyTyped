package typingsSlinky.griddleReact.mod.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeadingCellProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var columnId: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[js.Any] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object TableHeadingCellProps {
  
  @scala.inline
  def apply(): TableHeadingCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeadingCellProps]
  }
  
  @scala.inline
  implicit class TableHeadingCellPropsMutableBuilder[Self <: TableHeadingCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
