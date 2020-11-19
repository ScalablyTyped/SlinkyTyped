package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.after
import typingsSlinky.devextreme.devextremeStrings.before
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.expand
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.overlap
import typingsSlinky.devextreme.devextremeStrings.push
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.shrink
import typingsSlinky.devextreme.devextremeStrings.slide
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDrawerOptions extends WidgetOptions[dxDrawer] {
  
  /** @name dxDrawer.Options.animationDuration */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /** @name dxDrawer.Options.animationEnabled */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /** @name dxDrawer.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  
  /** @name dxDrawer.Options.maxSize */
  var maxSize: js.UndefOr[Double] = js.native
  
  /** @name dxDrawer.Options.minSize */
  var minSize: js.UndefOr[Double] = js.native
  
  /** @name dxDrawer.Options.opened */
  var opened: js.UndefOr[Boolean] = js.native
  
  /** @name dxDrawer.Options.openedStateMode */
  var openedStateMode: js.UndefOr[overlap | shrink | push] = js.native
  
  /** @name dxDrawer.Options.position */
  var position: js.UndefOr[left | right | top | bottom | before | after] = js.native
  
  /** @name dxDrawer.Options.revealMode */
  var revealMode: js.UndefOr[slide | expand] = js.native
  
  /** @name dxDrawer.Options.shading */
  var shading: js.UndefOr[Boolean] = js.native
  
  /** @deprecated */
  /** @name dxDrawer.Options.target */
  var target: js.UndefOr[String | Element | JQuery] = js.native
  
  /** @name dxDrawer.Options.template */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
  ] = js.native
}
object dxDrawerOptions {
  
  @scala.inline
  def apply(): dxDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDrawerOptions]
  }
  
  @scala.inline
  implicit class dxDrawerOptionsOps[Self <: dxDrawerOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self = this.set("closeOnOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    
    @scala.inline
    def setOpenedStateMode(value: overlap | shrink | push): Self = this.set("openedStateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenedStateMode: Self = this.set("openedStateMode", js.undefined)
    
    @scala.inline
    def setPosition(value: left | right | top | bottom | before | after): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRevealMode(value: slide | expand): Self = this.set("revealMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealMode: Self = this.set("revealMode", js.undefined)
    
    @scala.inline
    def setShading(value: Boolean): Self = this.set("shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    
    @scala.inline
    def setTargetElement(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | Element | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTemplateFunction1(value: /* Element */ dxElement => _): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateElement(value: Element): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
