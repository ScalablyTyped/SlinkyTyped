package typingsSlinky.reactSortableHoc.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactSortableHoc.AnonCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableContainerProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.native
  var distance: js.UndefOr[Double] = js.native
  var getContainer: js.UndefOr[ContainerGetter] = js.native
  var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.native
  var helperClass: js.UndefOr[String] = js.native
  var helperContainer: js.UndefOr[HTMLElement | HelperContainerGetter] = js.native
  var hideSortableGhost: js.UndefOr[Boolean] = js.native
  var keyCodes: js.UndefOr[AnonCancel] = js.native
  var keyboardSortingTransitionDuration: js.UndefOr[Double] = js.native
  var lockAxis: js.UndefOr[Axis] = js.native
  var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.native
  var lockToContainerEdges: js.UndefOr[Boolean] = js.native
  var onSortEnd: js.UndefOr[SortEndHandler] = js.native
  var onSortMove: js.UndefOr[SortMoveHandler] = js.native
  var onSortOver: js.UndefOr[SortOverHandler] = js.native
  var onSortStart: js.UndefOr[SortStartHandler] = js.native
  var pressDelay: js.UndefOr[Double] = js.native
  var pressThreshold: js.UndefOr[Double] = js.native
  var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var updateBeforeSortStart: js.UndefOr[SortStartHandler] = js.native
  var useDragHandle: js.UndefOr[Boolean] = js.native
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
}

object SortableContainerProps {
  @scala.inline
  def apply(): SortableContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableContainerProps]
  }
  @scala.inline
  implicit class SortableContainerPropsOps[Self <: SortableContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainer(value: /* element */ ReactElement => HTMLElement | js.Promise[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHelperDimensions(value: /* sort */ SortStart => Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelperDimensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHelperDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelperDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelperContainerFunction0(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHelperContainer(value: HTMLElement | HelperContainerGetter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSortableGhost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSortableGhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSortableGhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSortableGhost")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCodes(value: AnonCancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardSortingTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardSortingTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardSortingTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardSortingTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAxis(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withLockOffset(value: Offset | (js.Tuple2[Offset, Offset])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLockToContainerEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockToContainerEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockToContainerEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockToContainerEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortEnd(value: (/* sort */ SortEnd, /* event */ SortEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSortEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortMove(value: /* event */ SortEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSortMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortOver(value: (/* sort */ SortOver, /* event */ SortEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSortOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSortStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPressDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPressThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCancelStart(value: /* event */ SortEvent | SortEventWithTag => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldCancelStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBeforeSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBeforeSortStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateBeforeSortStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBeforeSortStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDragHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDragHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDragHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDragHandle")(js.undefined)
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

