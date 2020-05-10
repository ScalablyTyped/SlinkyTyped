package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typingsSlinky.antdMobileRn.gridIndexNativeMod.GridProps
import typingsSlinky.antdMobileRn.gridPropsTypeMod.DataItem
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  @JSImport("antd-mobile-rn", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Grid] {
    @scala.inline
    def carouselMaxRow(value: Double): this.type = set("carouselMaxRow", value.asInstanceOf[js.Any])
    @scala.inline
    def carouselProps(value: CarouselProps): this.type = set("carouselProps", value.asInstanceOf[js.Any])
    @scala.inline
    def columnNum(value: Double): this.type = set("columnNum", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[js.UndefOr[DataItem]]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def hasLine(value: Boolean): this.type = set("hasLine", value.asInstanceOf[js.Any])
    @scala.inline
    def isCarousel(value: Boolean): this.type = set("isCarousel", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemStyleNull: this.type = set("itemStyle", null)
    @scala.inline
    def onClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def renderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): this.type = set("renderItem", js.Any.fromFunction2(value))
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

