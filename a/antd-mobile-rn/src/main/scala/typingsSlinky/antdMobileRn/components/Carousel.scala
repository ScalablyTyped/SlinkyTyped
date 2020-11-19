package typingsSlinky.antdMobileRn.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typingsSlinky.antdMobileRn.carouselIndexNativeMod.CarouselState
import typingsSlinky.antdMobileRn.carouselIndexNativeMod.PaginationProps
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("antd-mobile-rn", "Carousel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Carousel] {
    
    @scala.inline
    def afterChange(value: /* index */ Double => Unit): this.type = set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotActiveStyle(value: StyleProp[ViewStyle]): this.type = set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotActiveStyleNull: this.type = set("dotActiveStyle", null)
    
    @scala.inline
    def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotStyleNull: this.type = set("dotStyle", null)
    
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSlideWidth(value: Double): this.type = set("initialSlideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMomentumScrollEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsSlinky.antdMobileRn.carouselIndexNativeMod.Carousel) => Unit
    ): this.type = set("onMomentumScrollEnd", js.Any.fromFunction3(value))
    
    @scala.inline
    def onScrollBeginDrag(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsSlinky.antdMobileRn.carouselIndexNativeMod.Carousel) => Unit
    ): this.type = set("onScrollBeginDrag", js.Any.fromFunction3(value))
    
    @scala.inline
    def pagination(value: /* props */ PaginationProps => ReactElement): this.type = set("pagination", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
