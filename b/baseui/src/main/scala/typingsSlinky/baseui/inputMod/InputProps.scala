package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProps extends BaseInputProps[HTMLInputElement] {
  
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactElement]) | ReactElement] = js.native
  
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.native
  
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactElement]) | ReactElement] = js.native
}
object InputProps {
  
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  @scala.inline
  implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactElement]) | ReactElement): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactElement): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndEnhancerReactElement(value: ReactElement): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    @scala.inline
    def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactElement]) | ReactElement): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactElement): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartEnhancerReactElement(value: ReactElement): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
  }
}
