package typingsSlinky.reactour.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactour.reactourMod.ReactourProps
import typingsSlinky.reactour.reactourMod.ReactourStep
import typingsSlinky.reactour.reactourMod.default
import typingsSlinky.reactour.reactourStrings.esc
import typingsSlinky.reactour.reactourStrings.left
import typingsSlinky.reactour.reactourStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reactour
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("reactour", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    isOpen: Boolean,
    onRequestClose: SyntheticMouseEvent[HTMLDivElement] => Unit,
    steps: js.Array[ReactourStep],
    accentColor: String = null,
    badgeContent: (/* current */ Double, /* total */ Double) => TagMod[Any] = null,
    closeWithMask: js.UndefOr[Boolean] = js.undefined,
    disableDotsNavigation: js.UndefOr[Boolean] = js.undefined,
    disableInteraction: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardNavigation: Boolean | (js.Array[esc | right | left]) = null,
    getCurrentStep: /* currentStep */ Double => Unit = null,
    goToStep: Int | Double = null,
    highlightedMaskClassName: String = null,
    inViewThreshold: Int | Double = null,
    lastStepNextButton: TagMod[Any] = null,
    maskClassName: String = null,
    maskSpace: Int | Double = null,
    nextButton: TagMod[Any] = null,
    nextStep: () => Unit = null,
    onAfterOpen: /* target */ HTMLDivElement => Unit = null,
    onBeforeClose: /* target */ HTMLDivElement => Unit = null,
    prevButton: TagMod[Any] = null,
    prevStep: () => Unit = null,
    rounded: Int | Double = null,
    scrollDuration: Int | Double = null,
    scrollOffset: Int | Double = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showNavigation: js.UndefOr[Boolean] = js.undefined,
    showNavigationNumber: js.UndefOr[Boolean] = js.undefined,
    showNumber: js.UndefOr[Boolean] = js.undefined,
    startAt: Int | Double = null,
    update: String = null,
    updateDelay: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps.asInstanceOf[js.Any])
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (badgeContent != null) __obj.updateDynamic("badgeContent")(js.Any.fromFunction2(badgeContent))
    if (!js.isUndefined(closeWithMask)) __obj.updateDynamic("closeWithMask")(closeWithMask.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDotsNavigation)) __obj.updateDynamic("disableDotsNavigation")(disableDotsNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction.asInstanceOf[js.Any])
    if (disableKeyboardNavigation != null) __obj.updateDynamic("disableKeyboardNavigation")(disableKeyboardNavigation.asInstanceOf[js.Any])
    if (getCurrentStep != null) __obj.updateDynamic("getCurrentStep")(js.Any.fromFunction1(getCurrentStep))
    if (goToStep != null) __obj.updateDynamic("goToStep")(goToStep.asInstanceOf[js.Any])
    if (highlightedMaskClassName != null) __obj.updateDynamic("highlightedMaskClassName")(highlightedMaskClassName.asInstanceOf[js.Any])
    if (inViewThreshold != null) __obj.updateDynamic("inViewThreshold")(inViewThreshold.asInstanceOf[js.Any])
    if (lastStepNextButton != null) __obj.updateDynamic("lastStepNextButton")(lastStepNextButton.asInstanceOf[js.Any])
    if (maskClassName != null) __obj.updateDynamic("maskClassName")(maskClassName.asInstanceOf[js.Any])
    if (maskSpace != null) __obj.updateDynamic("maskSpace")(maskSpace.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (nextStep != null) __obj.updateDynamic("nextStep")(js.Any.fromFunction0(nextStep))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction1(onAfterOpen))
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(js.Any.fromFunction1(onBeforeClose))
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    if (prevStep != null) __obj.updateDynamic("prevStep")(js.Any.fromFunction0(prevStep))
    if (rounded != null) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigation)) __obj.updateDynamic("showNavigation")(showNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationNumber)) __obj.updateDynamic("showNavigationNumber")(showNavigationNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactourProps
}

