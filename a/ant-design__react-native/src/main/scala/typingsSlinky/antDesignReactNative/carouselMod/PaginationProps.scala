package typingsSlinky.antDesignReactNative.carouselMod

import typingsSlinky.antDesignReactNative.anon.Pagination
import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var count: Double = js.native
  var current: Double = js.native
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: ReturnType[js.Function1[/* theme */ Theme, Pagination]] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object PaginationProps {
  @scala.inline
  def apply(count: Double, current: Double, styles: ReturnType[js.Function1[/* theme */ Theme, Pagination]]): PaginationProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: ReturnType[js.Function1[/* theme */ Theme, Pagination]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
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
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

