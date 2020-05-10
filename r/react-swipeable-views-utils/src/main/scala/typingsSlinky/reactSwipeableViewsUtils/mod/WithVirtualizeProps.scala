package typingsSlinky.reactSwipeableViewsUtils.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsSlinky.reactSwipeableViews.mod.OnTransitionEndCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithVirtualizeProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.native
  var overscanSlideAfter: js.UndefOr[Double] = js.native
  var overscanSlideBefore: js.UndefOr[Double] = js.native
  var slideCount: js.UndefOr[Double] = js.native
  var slideRenderer: SlideRendererCallback = js.native
}

object WithVirtualizeProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    slideRenderer: /* render */ SlideRenderProps => TagMod[Any]
  ): WithVirtualizeProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
    __obj.asInstanceOf[WithVirtualizeProps]
  }
  @scala.inline
  implicit class WithVirtualizePropsOps[Self <: WithVirtualizeProps] (val x: Self) extends AnyVal {
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
    def withOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSlideRenderer(value: /* render */ SlideRenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanSlideAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanSlideAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanSlideAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanSlideAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanSlideBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanSlideBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanSlideBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanSlideBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(js.undefined)
        ret
    }
  }
  
}

