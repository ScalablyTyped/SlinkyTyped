package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.segmentedAndroidMod.SegmentControlNativeProps
import typingsSlinky.antdMobileRn.segmentedAndroidMod.default
import typingsSlinky.antdMobileRn.segmentedControlStyleIndexNativeMod.ISegmentControlStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedDotandroid {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* value */ String => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: ISegmentControlStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valuesVarargs(value: String*): this.type = set("values", js.Array(value :_*))
    
    @scala.inline
    def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentControlNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SegmentedDotandroid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
