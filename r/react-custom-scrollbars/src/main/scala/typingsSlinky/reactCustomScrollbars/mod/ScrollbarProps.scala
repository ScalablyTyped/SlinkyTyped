package typingsSlinky.reactCustomScrollbars.mod

import slinky.core.ReactComponentClass
import slinky.web.SyntheticUIEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.UIEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarProps
  extends AllHTMLAttributes[Scrollbars]
     with ClassAttributes[Scrollbars] {
  var autoHeight: js.UndefOr[Boolean] = js.native
  var autoHeightMax: js.UndefOr[Double | String] = js.native
  var autoHeightMin: js.UndefOr[Double | String] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var autoHideDuration: js.UndefOr[Double] = js.native
  var autoHideTimeout: js.UndefOr[Double] = js.native
  var hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.native
  var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onScrollStop: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("onScroll")
  var onScroll_ScrollbarProps: js.UndefOr[UIEventHandler[_]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
  var renderThumbHorizontal: js.UndefOr[ReactComponentClass[_]] = js.native
  var renderThumbVertical: js.UndefOr[ReactComponentClass[_]] = js.native
  var renderTrackHorizontal: js.UndefOr[ReactComponentClass[_]] = js.native
  var renderTrackVertical: js.UndefOr[ReactComponentClass[_]] = js.native
  var renderView: js.UndefOr[ReactComponentClass[_]] = js.native
  var tagName: js.UndefOr[String] = js.native
  var thumbMinSize: js.UndefOr[Double] = js.native
  var thumbSize: js.UndefOr[Double] = js.native
  var universal: js.UndefOr[Boolean] = js.native
}

object ScrollbarProps {
  @scala.inline
  def apply(): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarProps]
  }
  @scala.inline
  implicit class ScrollbarPropsOps[Self <: ScrollbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeightMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeightMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightMax")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeightMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeightMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightMin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTracksWhenNotNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTracksWhenNotNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTracksWhenNotNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTracksWhenNotNeeded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticUIEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollFrame(value: /* values */ positionValues => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScrollStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* values */ positionValues => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderThumbHorizontal(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderThumbHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderThumbVertical(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderThumbVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTrackHorizontal(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrackHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTrackHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrackHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTrackVertical(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrackVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTrackVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTrackVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderView(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderView")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUniversal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniversal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universal")(js.undefined)
        ret
    }
  }
  
}

