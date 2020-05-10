package typingsSlinky.reactOnsenui

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.mod.Tabbar
import typingsSlinky.reactOnsenui.mod.TabbarRenderTab
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.auto
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.bottom
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.slide
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  index  :number, renderTabs (index : number, tabbar : react-onsenui.react-onsenui.Tabbar): std.Array<react-onsenui.react-onsenui.TabbarRenderTab>,   position ? :'bottom' | 'top' | 'auto',   swipeable ? :boolean,   ignoreEdgeWidth ? :number,   animation ? :'none' | 'slide',   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   tabBorder ? :boolean,   onPreChange ? :(): void,   onPostChange ? :(): void,   onReactive ? :(): void,   onSwipe ? :(index : number, animationOptions : react-onsenui.react-onsenui.AnimationOptions): void} */
@js.native
trait HTMLAttributesidclassNameIgnoreEdgeWidth extends js.Object {
  var animation: js.UndefOr[none | slide] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreEdgeWidth: js.UndefOr[Double] = js.native
  var index: Double = js.native
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipe: js.UndefOr[js.Function2[/* index */ Double, /* animationOptions */ AnimationOptions, Unit]] = js.native
  var position: js.UndefOr[bottom | top | auto] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeable: js.UndefOr[Boolean] = js.native
  var tabBorder: js.UndefOr[Boolean] = js.native
  def renderTabs(index: Double, tabbar: Tabbar): js.Array[TabbarRenderTab] = js.native
}

object HTMLAttributesidclassNameIgnoreEdgeWidth {
  @scala.inline
  def apply(index: Double, renderTabs: (Double, Tabbar) => js.Array[TabbarRenderTab]): HTMLAttributesidclassNameIgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    __obj.asInstanceOf[HTMLAttributesidclassNameIgnoreEdgeWidth]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameIgnoreEdgeWidthOps[Self <: HTMLAttributesidclassNameIgnoreEdgeWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTabs(value: (Double, Tabbar) => js.Array[TabbarRenderTab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnimation(value: none | slide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
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
    def withIgnoreEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEdgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEdgeWidth")(js.undefined)
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
    def withOnPreChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPreChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReactive(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReactive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReactive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipe(value: (/* index */ Double, /* animationOptions */ AnimationOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: bottom | top | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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
    @scala.inline
    def withTabBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBorder")(js.undefined)
        ret
    }
  }
  
}

