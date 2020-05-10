package typingsSlinky.hopscotch

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.hopscotch.hopscotchStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDefinition extends js.Object {
  var arrowOffset: js.UndefOr[Double | center] = js.native
  var content: js.UndefOr[String] = js.native
  var ctaLabel: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var fixedElement: js.UndefOr[Boolean] = js.native
  var multipage: js.UndefOr[Boolean] = js.native
  var nextOnTargetClick: js.UndefOr[Boolean] = js.native
  var onCTA: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var padding: js.UndefOr[Double] = js.native
  var placement: placementTypes = js.native
  var showCTAButton: js.UndefOr[Boolean] = js.native
  var showNextButton: js.UndefOr[Boolean] = js.native
  var showPrevButton: js.UndefOr[Boolean] = js.native
  var showSkip: js.UndefOr[Boolean] = js.native
  var target: String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xOffset: js.UndefOr[Double | center] = js.native
  var yOffset: js.UndefOr[Double | center] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object StepDefinition {
  @scala.inline
  def apply(placement: placementTypes, target: String | HTMLElement | (js.Array[String | HTMLElement])): StepDefinition = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  @scala.inline
  implicit class StepDefinitionOps[Self <: StepDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlacement(value: placementTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowOffset(value: Double | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCtaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipage")(js.undefined)
        ret
    }
    @scala.inline
    def withNextOnTargetClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextOnTargetClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextOnTargetClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextOnTargetClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCTAFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCTA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCTA(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCTA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCTA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCTA")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNext(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPrev(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnShow(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCTAButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCTAButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCTAButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCTAButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNextButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrevButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXOffset(value: Double | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withYOffset(value: Double | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

