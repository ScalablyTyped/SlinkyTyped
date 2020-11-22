package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Delay
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPopoverOptions[T] extends dxPopupOptions[T] {
  
  /**
    * [descr:dxPopover.Options.animation]
    */
  @JSName("animation")
  var animation_dxPopoverOptions: js.UndefOr[dxPopoverAnimation] = js.native
  
  /**
    * [descr:dxPopover.Options.hideEvent]
    */
  var hideEvent: js.UndefOr[Delay | String] = js.native
  
  /**
    * [descr:dxPopover.Options.position]
    */
  @JSName("position")
  var position_dxPopoverOptions: js.UndefOr[bottom | left | right | top | positionConfig] = js.native
  
  /**
    * [descr:dxPopover.Options.showEvent]
    */
  var showEvent: js.UndefOr[Delay | String] = js.native
  
  /**
    * [descr:dxPopover.Options.target]
    */
  var target: js.UndefOr[String | Element | JQuery] = js.native
}
object dxPopoverOptions {
  
  @scala.inline
  def apply[T](): dxPopoverOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopoverOptions[T]]
  }
  
  @scala.inline
  implicit class dxPopoverOptionsOps[Self <: dxPopoverOptions[_], T] (val x: Self with dxPopoverOptions[T]) extends AnyVal {
    
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
    def setAnimation(value: dxPopoverAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setHideEvent(value: Delay | String): Self = this.set("hideEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideEvent: Self = this.set("hideEvent", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | left | right | top | positionConfig): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowEvent(value: Delay | String): Self = this.set("showEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEvent: Self = this.set("showEvent", js.undefined)
    
    @scala.inline
    def setTargetElement(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | Element | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
