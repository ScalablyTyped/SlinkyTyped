package typingsSlinky.antdMobileRn.carouselIndexNativeMod

import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.antdMobileRn.carouselPropsTypeMod.CarouselPropsType
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps extends CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var bounces: js.UndefOr[Boolean] = js.native
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ CarouselState, 
      /* carousel */ Carousel, 
      Unit
    ]
  ] = js.native
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ CarouselState, 
      /* carousel */ Carousel, 
      Unit
    ]
  ] = js.native
  var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, TagMod[Any]]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[js.Any] = js.native
}

object CarouselProps {
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterChange(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBounces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(js.undefined)
        ret
    }
    @scala.inline
    def withDotActiveStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActiveStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotActiveStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActiveStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDotActiveStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActiveStyle")(null)
        ret
    }
    @scala.inline
    def withDotStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDotStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(null)
        ret
    }
    @scala.inline
    def withOnMomentumScrollEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMomentumScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMomentumScrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollBeginDrag(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnScrollBeginDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollBeginDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: /* props */ PaginationProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

