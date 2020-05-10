package typingsSlinky.antDesignReactNative.gridMod

import typingsSlinky.antDesignReactNative.carouselMod.CarouselProps
import typingsSlinky.antDesignReactNative.gridPropsTypeMod.GridPropsType
import typingsSlinky.antDesignReactNative.gridStyleMod.GridStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps
  extends GridPropsType
     with WithThemeStyles[GridStyle] {
  var carouselProps: js.UndefOr[CarouselProps] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object GridProps {
  @scala.inline
  def apply(carouselMaxRow: Double, columnNum: Double): GridProps = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarouselProps(value: CarouselProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(null)
        ret
    }
  }
  
}

