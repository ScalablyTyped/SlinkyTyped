package typingsSlinky.perfectScrollbar.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.perfectScrollbar.anon.X
import typingsSlinky.perfectScrollbar.mod.PerfectScrollbar.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfectScrollbar_ extends js.Object {
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
  var contentHeight: Double = js.native
  var contentWidth: Double = js.native
  var element: HTMLElement = js.native
  var isAlive: Boolean = js.native
  var isNegativeScroll: Boolean = js.native
  var isRtl: Boolean = js.native
  var isScrollbarXUsingBottom: Boolean = js.native
  var isScrollbarYUsingBottom: Boolean = js.native
  var lastScrollLeft: Boolean = js.native
  var lastScrollTop: Boolean = js.native
  var negativeScrollAdjustment: Double = js.native
  var railBorderXWidth: Double = js.native
  var railBorderYWidth: Double = js.native
  var railXMarginWidth: Double = js.native
  var railXRatio: Double = js.native
  var railXWidth: Double = js.native
  var railYHeight: Double = js.native
  var railYMarginHeight: Double = js.native
  var railYRatio: Double = js.native
  var reach: X = js.native
  var scrollbarX: HTMLElement = js.native
  var scrollbarXActive: Boolean = js.native
  var scrollbarXBottom: Double = js.native
  var scrollbarXLeft: Double = js.native
  var scrollbarXRail: HTMLElement = js.native
  var scrollbarXWidth: Double = js.native
  var scrollbarY: HTMLElement = js.native
  var scrollbarYActive: Boolean = js.native
  var scrollbarYHeight: Double = js.native
  var scrollbarYOuterWidth: js.UndefOr[Double] = js.native
  var scrollbarYRail: HTMLElement = js.native
  var scrollbarYRight: Double = js.native
  var scrollbarYTop: Double = js.native
  var settings: Options = js.native
  def destroy(): Unit = js.native
  def update(): Unit = js.native
}

object PerfectScrollbar_ {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    contentHeight: Double,
    contentWidth: Double,
    destroy: () => Unit,
    element: HTMLElement,
    isAlive: Boolean,
    isNegativeScroll: Boolean,
    isRtl: Boolean,
    isScrollbarXUsingBottom: Boolean,
    isScrollbarYUsingBottom: Boolean,
    lastScrollLeft: Boolean,
    lastScrollTop: Boolean,
    negativeScrollAdjustment: Double,
    railBorderXWidth: Double,
    railBorderYWidth: Double,
    railXMarginWidth: Double,
    railXRatio: Double,
    railXWidth: Double,
    railYHeight: Double,
    railYMarginHeight: Double,
    railYRatio: Double,
    reach: X,
    scrollbarX: HTMLElement,
    scrollbarXActive: Boolean,
    scrollbarXBottom: Double,
    scrollbarXLeft: Double,
    scrollbarXRail: HTMLElement,
    scrollbarXWidth: Double,
    scrollbarY: HTMLElement,
    scrollbarYActive: Boolean,
    scrollbarYHeight: Double,
    scrollbarYRail: HTMLElement,
    scrollbarYRight: Double,
    scrollbarYTop: Double,
    settings: Options,
    update: () => Unit
  ): PerfectScrollbar_ = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], isNegativeScroll = isNegativeScroll.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], isScrollbarXUsingBottom = isScrollbarXUsingBottom.asInstanceOf[js.Any], isScrollbarYUsingBottom = isScrollbarYUsingBottom.asInstanceOf[js.Any], lastScrollLeft = lastScrollLeft.asInstanceOf[js.Any], lastScrollTop = lastScrollTop.asInstanceOf[js.Any], negativeScrollAdjustment = negativeScrollAdjustment.asInstanceOf[js.Any], railBorderXWidth = railBorderXWidth.asInstanceOf[js.Any], railBorderYWidth = railBorderYWidth.asInstanceOf[js.Any], railXMarginWidth = railXMarginWidth.asInstanceOf[js.Any], railXRatio = railXRatio.asInstanceOf[js.Any], railXWidth = railXWidth.asInstanceOf[js.Any], railYHeight = railYHeight.asInstanceOf[js.Any], railYMarginHeight = railYMarginHeight.asInstanceOf[js.Any], railYRatio = railYRatio.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], scrollbarX = scrollbarX.asInstanceOf[js.Any], scrollbarXActive = scrollbarXActive.asInstanceOf[js.Any], scrollbarXBottom = scrollbarXBottom.asInstanceOf[js.Any], scrollbarXLeft = scrollbarXLeft.asInstanceOf[js.Any], scrollbarXRail = scrollbarXRail.asInstanceOf[js.Any], scrollbarXWidth = scrollbarXWidth.asInstanceOf[js.Any], scrollbarY = scrollbarY.asInstanceOf[js.Any], scrollbarYActive = scrollbarYActive.asInstanceOf[js.Any], scrollbarYHeight = scrollbarYHeight.asInstanceOf[js.Any], scrollbarYRail = scrollbarYRail.asInstanceOf[js.Any], scrollbarYRight = scrollbarYRight.asInstanceOf[js.Any], scrollbarYTop = scrollbarYTop.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PerfectScrollbar_]
  }
  @scala.inline
  implicit class PerfectScrollbar_Ops[Self <: PerfectScrollbar_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNegativeScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNegativeScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrollbarXUsingBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollbarXUsingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrollbarYUsingBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollbarYUsingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastScrollLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastScrollTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeScrollAdjustment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeScrollAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailBorderXWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railBorderXWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailBorderYWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railBorderYWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailXMarginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railXMarginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailXRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railXRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailXWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railXWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailYHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railYHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailYMarginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railYMarginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRailYRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railYRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarX(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarXActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarXActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarXBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarXBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarXLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarXLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarXRail(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarXRail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarXWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarXWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarY(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarYActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarYHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarYRail(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYRail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarYRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarYTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollbarYOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYOuterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarYOuterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarYOuterWidth")(js.undefined)
        ret
    }
  }
  
}

