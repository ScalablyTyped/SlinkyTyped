package typingsSlinky.reactInstantsearchDom.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBoxProps extends CommonWidgetProps {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var defaultRefinement: js.UndefOr[String] = js.native
  
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.native
  
  var loadingIndicator: js.UndefOr[ReactElement] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLInputElement], _]] = js.native
  
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLFormElement], _]] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLFormElement], _]] = js.native
  
  var reset: js.UndefOr[ReactElement] = js.native
  
  var searchAsYouType: js.UndefOr[Boolean] = js.native
  
  var showLoadingIndicator: js.UndefOr[Boolean] = js.native
  
  var submit: js.UndefOr[ReactElement] = js.native
}
object SearchBoxProps {
  
  @scala.inline
  def apply(): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxProps]
  }
  
  @scala.inline
  implicit class SearchBoxPropsMutableBuilder[Self <: SearchBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    @scala.inline
    def setFocusShortcuts(value: js.Array[String]): Self = StObject.set(x, "focusShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusShortcutsUndefined: Self = StObject.set(x, "focusShortcuts", js.undefined)
    
    @scala.inline
    def setFocusShortcutsVarargs(value: String*): Self = StObject.set(x, "focusShortcuts", js.Array(value :_*))
    
    @scala.inline
    def setLoadingIndicator(value: ReactElement): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ SyntheticEvent[Event, HTMLInputElement] => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setReset(value: ReactElement): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSearchAsYouType(value: Boolean): Self = StObject.set(x, "searchAsYouType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAsYouTypeUndefined: Self = StObject.set(x, "searchAsYouType", js.undefined)
    
    @scala.inline
    def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
    
    @scala.inline
    def setSubmit(value: ReactElement): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
