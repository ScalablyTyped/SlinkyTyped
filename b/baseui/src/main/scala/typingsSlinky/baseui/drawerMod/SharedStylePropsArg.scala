package typingsSlinky.baseui.drawerMod

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedStylePropsArg extends js.Object {
  
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
  
  var children: js.UndefOr[ReactElement] = js.native
}
object SharedStylePropsArg {
  
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$anchor(value: left | right | top | bottom): Self = this.set("$anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$anchor: Self = this.set("$anchor", js.undefined)
    
    @scala.inline
    def set$animating(value: Boolean): Self = this.set("$animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$animating: Self = this.set("$animating", js.undefined)
    
    @scala.inline
    def set$closeable(value: Boolean): Self = this.set("$closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$closeable: Self = this.set("$closeable", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = this.set("$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isOpen: Self = this.set("$isOpen", js.undefined)
    
    @scala.inline
    def set$isVisible(value: Boolean): Self = this.set("$isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isVisible: Self = this.set("$isVisible", js.undefined)
    
    @scala.inline
    def set$size(value: default_ | full | auto): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
