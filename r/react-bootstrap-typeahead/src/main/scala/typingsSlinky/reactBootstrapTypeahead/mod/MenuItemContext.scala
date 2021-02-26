package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
@js.native
trait MenuItemContext[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var isOnlyResult: js.UndefOr[Boolean] = js.native
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.native
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.native
}
object MenuItemContext {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemContext[T]]
  }
  
  @scala.inline
  implicit class MenuItemContextMutableBuilder[Self <: MenuItemContext[_], T /* <: TypeaheadModel */] (val x: Self with MenuItemContext[T]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setIsOnlyResult(value: Boolean): Self = StObject.set(x, "isOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnlyResultUndefined: Self = StObject.set(x, "isOnlyResult", js.undefined)
    
    @scala.inline
    def setOnActiveItemChange(value: /* options */ T => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    @scala.inline
    def setOnInitialItemChange(value: /* option */ T => Unit): Self = StObject.set(x, "onInitialItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitialItemChangeUndefined: Self = StObject.set(x, "onInitialItemChange", js.undefined)
    
    @scala.inline
    def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Unit): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMenuItemClickUndefined: Self = StObject.set(x, "onMenuItemClick", js.undefined)
  }
}
