package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.NextText
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.button
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.number
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.pointer
import typingsSlinky.antDesignReactNative.paginationMod.PaginationNativeProps
import typingsSlinky.antDesignReactNative.paginationStyleMod.PaginationStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("@ant-design/react-native", "Pagination")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Pagination] {
    
    @scala.inline
    def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    @scala.inline
    def locale(value: NextText): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: button | number | pointer): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextText(value: String): this.type = set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNext(value: () => Unit): this.type = set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPrev(value: () => Unit): this.type = set("onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def prevText(value: String): this.type = set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[PaginationStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(current: Double, total: Double): Builder = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationNativeProps]))
  }
}
