package typingsSlinky.reactNavigation.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNavigation.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeAreaViewProps extends ViewProps {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var forceInset: js.UndefOr[Bottom] = js.native
}
object SafeAreaViewProps {
  
  @scala.inline
  def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  
  @scala.inline
  implicit class SafeAreaViewPropsMutableBuilder[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
  }
}
