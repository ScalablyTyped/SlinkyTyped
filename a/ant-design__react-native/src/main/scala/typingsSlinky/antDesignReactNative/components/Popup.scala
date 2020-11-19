package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.cascaderPopupMod.IPopupCascaderProps
import typingsSlinky.antDesignReactNative.cascaderPopupMod.default
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderValue
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @JSImport("@ant-design/react-native/lib/picker/cascader/Popup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def WrapComponent(value: js.Any): this.type = set("WrapComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionTextActiveOpacity(value: Double): this.type = set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionTextUnderlayColor(value: String): this.type = set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement | String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissTextReactElement(value: ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissText(value: String | ReactElement): this.type = set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: String | ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onOk(value: /* value */ js.UndefOr[js.Any] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def picker(value: js.Any): this.type = set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerValueChangeProp(value: String): this.type = set("pickerValueChangeProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pickerValueProp(value: String): this.type = set("pickerValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupTransitionName(value: String): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerType(value: String): this.type = set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapStyle(value: CSSProperties): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPopupCascaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(cascader: ReactElement): Builder = {
    val __props = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPopupCascaderProps]))
  }
}
