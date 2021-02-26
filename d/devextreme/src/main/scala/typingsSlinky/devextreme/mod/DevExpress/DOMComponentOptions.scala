package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.anon.Model
import typingsSlinky.devextreme.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMComponentOptions[T] extends ComponentOptions[T] {
  
  /**
    * [descr:DOMComponent.Options.bindingOptions]
    */
  var bindingOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DOMComponent.Options.elementAttr]
    */
  var elementAttr: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DOMComponent.Options.height]
    */
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  
  /**
    * [descr:DOMComponent.Options.onDisposing]
    */
  @JSName("onDisposing")
  var onDisposing_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ Model[T], _]] = js.native
  
  /**
    * [descr:DOMComponent.Options.onOptionChanged]
    */
  @JSName("onOptionChanged")
  var onOptionChanged_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ Name[T], _]] = js.native
  
  /**
    * [descr:DOMComponent.Options.rtlEnabled]
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:DOMComponent.Options.width]
    */
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
}
object DOMComponentOptions {
  
  @scala.inline
  def apply[T](): DOMComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMComponentOptions[T]]
  }
  
  @scala.inline
  implicit class DOMComponentOptionsMutableBuilder[Self <: DOMComponentOptions[_], T] (val x: Self with DOMComponentOptions[T]) extends AnyVal {
    
    @scala.inline
    def setBindingOptions(value: js.Any): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    @scala.inline
    def setElementAttr(value: js.Any): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOnDisposing(value: /* e */ Model[T] => _): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    @scala.inline
    def setOnOptionChanged(value: /* e */ Name[T] => _): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    @scala.inline
    def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
