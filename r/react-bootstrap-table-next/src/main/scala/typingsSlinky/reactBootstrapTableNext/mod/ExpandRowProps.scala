package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandRowProps[T, K] extends StObject {
  
  var className: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.native
  
  var expandByColumnOnly: js.UndefOr[Boolean] = js.native
  
  var expandColumnPosition: js.UndefOr[left | right] = js.native
  
  var expandColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandColumnRendererProps, ReactElement]] = js.native
  
  var expandHeaderColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandHeaderColumnRenderer, ReactElement]] = js.native
  
  var expanded: js.UndefOr[js.Array[K]] = js.native
  
  var nonExpandable: js.UndefOr[js.Array[K]] = js.native
  
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      Unit
    ]
  ] = js.native
  
  var onExpandAll: js.UndefOr[
    js.Function3[
      /* isExpandAll */ Boolean, 
      /* results */ js.Array[T], 
      /* e */ SyntheticEvent[Event, Element], 
      Unit
    ]
  ] = js.native
  
  var onlyOneExpanding: js.UndefOr[Boolean] = js.native
  
  def renderer(row: T, rowIndex: Double): ReactElement = js.native
  
  var showExpandColumn: js.UndefOr[Boolean] = js.native
}
object ExpandRowProps {
  
  @scala.inline
  def apply[T, K](renderer: (T, Double) => ReactElement): ExpandRowProps[T, K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction2(renderer))
    __obj.asInstanceOf[ExpandRowProps[T, K]]
  }
  
  @scala.inline
  implicit class ExpandRowPropsMutableBuilder[Self <: ExpandRowProps[_, _], T, K] (val x: Self with (ExpandRowProps[T, K])) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "className", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setExpandByColumnOnly(value: Boolean): Self = StObject.set(x, "expandByColumnOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandByColumnOnlyUndefined: Self = StObject.set(x, "expandByColumnOnly", js.undefined)
    
    @scala.inline
    def setExpandColumnPosition(value: left | right): Self = StObject.set(x, "expandColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandColumnPositionUndefined: Self = StObject.set(x, "expandColumnPosition", js.undefined)
    
    @scala.inline
    def setExpandColumnRenderer(value: /* props */ ExpandColumnRendererProps => ReactElement): Self = StObject.set(x, "expandColumnRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandColumnRendererUndefined: Self = StObject.set(x, "expandColumnRenderer", js.undefined)
    
    @scala.inline
    def setExpandHeaderColumnRenderer(value: /* props */ ExpandHeaderColumnRenderer => ReactElement): Self = StObject.set(x, "expandHeaderColumnRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandHeaderColumnRendererUndefined: Self = StObject.set(x, "expandHeaderColumnRenderer", js.undefined)
    
    @scala.inline
    def setExpanded(value: js.Array[K]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setExpandedVarargs(value: K*): Self = StObject.set(x, "expanded", js.Array(value :_*))
    
    @scala.inline
    def setNonExpandable(value: js.Array[K]): Self = StObject.set(x, "nonExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonExpandableUndefined: Self = StObject.set(x, "nonExpandable", js.undefined)
    
    @scala.inline
    def setNonExpandableVarargs(value: K*): Self = StObject.set(x, "nonExpandable", js.Array(value :_*))
    
    @scala.inline
    def setOnExpand(
      value: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnExpandAll(
      value: (/* isExpandAll */ Boolean, /* results */ js.Array[T], /* e */ SyntheticEvent[Event, Element]) => Unit
    ): Self = StObject.set(x, "onExpandAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnExpandAllUndefined: Self = StObject.set(x, "onExpandAll", js.undefined)
    
    @scala.inline
    def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    @scala.inline
    def setOnlyOneExpanding(value: Boolean): Self = StObject.set(x, "onlyOneExpanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyOneExpandingUndefined: Self = StObject.set(x, "onlyOneExpanding", js.undefined)
    
    @scala.inline
    def setRenderer(value: (T, Double) => ReactElement): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowExpandColumn(value: Boolean): Self = StObject.set(x, "showExpandColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowExpandColumnUndefined: Self = StObject.set(x, "showExpandColumn", js.undefined)
  }
}
