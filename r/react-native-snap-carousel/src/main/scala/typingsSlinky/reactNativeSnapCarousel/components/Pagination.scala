package typingsSlinky.reactNativeSnapCarousel.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSnapCarousel.mod.PaginationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSnapCarousel.mod.Pagination] {
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def animatedDuration(value: Double): this.type = set("animatedDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def animatedFriction(value: Double): this.type = set("animatedFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def animatedTension(value: Double): this.type = set("animatedTension", value.asInstanceOf[js.Any])
    @scala.inline
    def carouselRef(value: ReactComponentClass[FlatListProps[_]]): this.type = set("carouselRef", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def delayPressInDot(value: Double): this.type = set("delayPressInDot", value.asInstanceOf[js.Any])
    @scala.inline
    def dotColor(value: String): this.type = set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dotContainerStyle(value: StyleProp[ViewStyle]): this.type = set("dotContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dotContainerStyleNull: this.type = set("dotContainerStyle", null)
    @scala.inline
    def dotElementReactElement(value: ReactElement): this.type = set("dotElement", value.asInstanceOf[js.Any])
    @scala.inline
    def dotElement(value: TagMod[Any]): this.type = set("dotElement", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyleNull: this.type = set("dotStyle", null)
    @scala.inline
    def inactiveDotColor(value: String): this.type = set("inactiveDotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotElementReactElement(value: ReactElement): this.type = set("inactiveDotElement", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotElement(value: TagMod[Any]): this.type = set("inactiveDotElement", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotOpacity(value: Double): this.type = set("inactiveDotOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotScale(value: Double): this.type = set("inactiveDotScale", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotStyle(value: StyleProp[ViewStyle]): this.type = set("inactiveDotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveDotStyleNull: this.type = set("inactiveDotStyle", null)
    @scala.inline
    def renderDots(value: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => TagMod[Any]): this.type = set("renderDots", js.Any.fromFunction3(value))
    @scala.inline
    def tappableDots(value: Boolean): this.type = set("tappableDots", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activeDotIndex: Double, dotsLength: Double): Builder = {
    val __props = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProperties]))
  }
}

