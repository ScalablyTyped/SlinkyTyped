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
trait RowProps extends StObject {
  
  var Cell: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnIds: js.UndefOr[js.Array[Double]] = js.native
  
  var griddleKey: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: js.Any): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnIds(value: js.Array[Double]): Self = StObject.set(x, "columnIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdsUndefined: Self = StObject.set(x, "columnIds", js.undefined)
    
    @scala.inline
    def setColumnIdsVarargs(value: Double*): Self = StObject.set(x, "columnIds", js.Array(value :_*))
    
    @scala.inline
    def setGriddleKey(value: String): Self = StObject.set(x, "griddleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGriddleKeyUndefined: Self = StObject.set(x, "griddleKey", js.undefined)
    
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
  }
}
