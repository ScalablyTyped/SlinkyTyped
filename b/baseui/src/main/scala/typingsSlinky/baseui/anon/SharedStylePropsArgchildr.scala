package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/drawer.SharedStylePropsArg & {  children :react.react.ReactNode} */
@js.native
trait SharedStylePropsArgchildr extends StObject {
  
  @JSName("$anchor")
  var $anchor: js.UndefOr[left | right | top | bottom] = js.native
  
  @JSName("$animating")
  var $animating: js.UndefOr[Boolean] = js.native
  
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  
  var children: js.UndefOr[ReactElement] with ReactElement = js.native
}
object SharedStylePropsArgchildr {
  
  @scala.inline
  def apply(): SharedStylePropsArgchildr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildr]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgchildrMutableBuilder[Self <: SharedStylePropsArgchildr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$anchor(value: left | right | top | bottom): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$anchorUndefined: Self = StObject.set(x, "$anchor", js.undefined)
    
    @scala.inline
    def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$animatingUndefined: Self = StObject.set(x, "$animating", js.undefined)
    
    @scala.inline
    def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    @scala.inline
    def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
    
    @scala.inline
    def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def setChildren(value: js.UndefOr[ReactElement] with ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
