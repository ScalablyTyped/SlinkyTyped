package typingsSlinky.rmcTrigger.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcTrigger.mod.default
import typingsSlinky.rmcTrigger.propsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RmcTrigger {
  @JSImport("rmc-trigger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def afterPopupVisibleChange(value: js.Function): this.type = set("afterPopupVisibleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def builtinPlacements(value: js.Any): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPopupVisible(value: Boolean): this.type = set("defaultPopupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def getDocument(value: js.Function): this.type = set("getDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupClassNameFromAlign(value: js.Any): this.type = set("getPopupClassNameFromAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupContainer(value: js.Function): this.type = set("getPopupContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def maskAnimation(value: String): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def maskTransitionName(value: String | js.Object): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def onPopupAlign(value: js.Function): this.type = set("onPopupAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def onPopupVisibleChange(value: js.Function): this.type = set("onPopupVisibleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def popupReactElement(value: ReactElement): this.type = set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def popup(value: ReactElement | js.Function): this.type = set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def popupAlign(value: js.Any): this.type = set("popupAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def popupAnimation(value: js.Any): this.type = set("popupAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def popupPlacement(value: String): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def popupStyle(value: js.Any): this.type = set("popupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def popupTransitionName(value: String | js.Object): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RmcTrigger.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

