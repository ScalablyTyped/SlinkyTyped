package typingsSlinky.reactInfinite.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteProps extends Props[Infinite] {
  var className: js.UndefOr[String] = js.native
  var containerHeight: js.UndefOr[Double] = js.native
  var displayBottomUpwards: js.UndefOr[Boolean] = js.native
  var elementHeight: Double | js.Array[Double] = js.native
  var handleScroll: js.UndefOr[js.Function1[/* node */ ReactElement, Unit]] = js.native
  var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.native
  var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.native
  var isInfiniteLoading: js.UndefOr[Boolean] = js.native
  var loadingSpinnerDelegate: js.UndefOr[ReactElement] = js.native
  var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.native
  var preloadBatchSize: js.UndefOr[Double | js.Object] = js.native
  var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.native
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
}

object InfiniteProps {
  @scala.inline
  def apply(elementHeight: Double | js.Array[Double]): InfiniteProps = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteProps]
  }
  @scala.inline
  implicit class InfinitePropsOps[Self <: InfiniteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementHeight(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementHeight")(value.asInstanceOf[js.Any])
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
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayBottomUpwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBottomUpwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBottomUpwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBottomUpwards")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleScroll(value: /* node */ ReactElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteLoadBeginBottomOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadBeginBottomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteLoadBeginBottomOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadBeginBottomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteLoadBeginEdgeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadBeginEdgeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteLoadBeginEdgeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadBeginEdgeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInfiniteLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInfiniteLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInfiniteLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInfiniteLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinnerDelegate(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinnerDelegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpinnerDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinnerDelegate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInfiniteLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfiniteLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInfiniteLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfiniteLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadAdditionalHeight(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadAdditionalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadAdditionalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadAdditionalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadBatchSize(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeScrollStateLastsForAfterUserScrolls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScrollStateLastsForAfterUserScrolls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeScrollStateLastsForAfterUserScrolls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScrollStateLastsForAfterUserScrolls")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWindowAsScrollContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWindowAsScrollContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWindowAsScrollContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWindowAsScrollContainer")(js.undefined)
        ret
    }
  }
  
}

