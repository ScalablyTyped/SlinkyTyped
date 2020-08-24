package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.carouselMod.CarouselProps
import typingsSlinky.antDesignReactNative.gridMod.GridProps
import typingsSlinky.antDesignReactNative.gridPropsTypeMod.DataItem
import typingsSlinky.antDesignReactNative.gridStyleMod.GridStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  @JSImport("@ant-design/react-native", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Grid] {
    @scala.inline
    def carouselProps(value: CarouselProps): this.type = set("carouselProps", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: js.UndefOr[DataItem]*): this.type = set("data", js.Array(value :_*))
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
    def onPress(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): this.type = set("onPress", js.Any.fromFunction2(value))
    @scala.inline
    def renderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): this.type = set("renderItem", js.Any.fromFunction2(value))
    @scala.inline
    def styles(value: Partial[GridStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(carouselMaxRow: Double, columnNum: Double): Builder = {
    val __props = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GridProps]))
  }
}

