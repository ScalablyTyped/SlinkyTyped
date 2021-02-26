package typingsSlinky.reactHotkeys.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeysProps extends HotKeysEnabledProps {
  
  /**
    * The React component that should be used in the DOM to wrap the FocusTrap's
    * children and have the internal key listeners bound to
    */
  var component: js.UndefOr[ReactComponent] = js.native
  
  var innerRef: js.UndefOr[ReactRef[HTMLElement]] = js.native
}
object HotKeysProps {
  
  @scala.inline
  def apply(): HotKeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysProps]
  }
  
  @scala.inline
  implicit class HotKeysPropsMutableBuilder[Self <: HotKeysProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ReactComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[ComponentProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setInnerRef(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
  }
}
