package typingsSlinky.reactBootstrapTable.mod

import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFieldProps extends StObject {
  
  /**
    * Custom css class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Default value for the search field
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * callback funciton to call when a key is released
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[_], Unit]] = js.native
  
  /**
    * Placeholder text for the search field
    */
  var placeholder: js.UndefOr[String] = js.native
}
object SearchFieldProps {
  
  @scala.inline
  def apply(): SearchFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFieldProps]
  }
  
  @scala.inline
  implicit class SearchFieldPropsMutableBuilder[Self <: SearchFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: /* e */ SyntheticKeyboardEvent[_] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
