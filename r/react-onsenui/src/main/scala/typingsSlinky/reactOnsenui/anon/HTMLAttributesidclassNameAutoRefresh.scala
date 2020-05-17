package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.horizontal
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  direction ? :'horizontal' | 'vertical',   fullscreen ? :boolean,   overscrollable ? :boolean,   centered ? :boolean,   itemWidth ? :number | string,   itemHeight ? :number | string,   autoScroll ? :boolean,   autoScrollRatio ? :number,   swipeable ? :boolean,   disabled ? :boolean,   index ? :number,   autoRefresh ? :boolean,   onPostChange ? :(): void,   onRefresh ? :(): void,   onOverscroll ? :(): void,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions} */
@js.native
trait HTMLAttributesidclassNameAutoRefresh extends js.Object {
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var autoRefresh: js.UndefOr[Boolean] = js.native
  var autoScroll: js.UndefOr[Boolean] = js.native
  var autoScrollRatio: js.UndefOr[Double] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var itemHeight: js.UndefOr[Double | String] = js.native
  var itemWidth: js.UndefOr[Double | String] = js.native
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.native
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  var overscrollable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeable: js.UndefOr[Boolean] = js.native
}

object HTMLAttributesidclassNameAutoRefresh {
  @scala.inline
  def apply(): HTMLAttributesidclassNameAutoRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameAutoRefresh]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameAutoRefreshOps[Self <: HTMLAttributesidclassNameAutoRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationOptions(value: AnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverscroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverscroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOverscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPostChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(js.undefined)
        ret
    }
  }
  
}

