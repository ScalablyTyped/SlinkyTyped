package typingsSlinky.reactNativeAppIntroSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAppIntroSlider.mod.AppIntroProps
import typingsSlinky.reactNativeAppIntroSlider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeAppIntroSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    slides: js.Array[_],
    activeDotStyle: ViewStyle = null,
    bottomButton: js.UndefOr[Boolean] = js.undefined,
    buttonStyle: ViewStyle = null,
    buttonTextStyle: TextProps = null,
    doneLabel: String = null,
    dotStyle: ViewStyle = null,
    hidePagination: js.UndefOr[Boolean] = js.undefined,
    nextLabel: String = null,
    onDone: () => Unit = null,
    onSkip: () => Unit = null,
    onSlideChange: (/* index */ Double, /* lastIndex */ Double) => Unit = null,
    paginationStyle: ViewStyle = null,
    prevLabel: String = null,
    renderDoneButton: () => Unit = null,
    renderItem: /* item */ js.Any => ReactElement = null,
    renderNextButton: () => Unit = null,
    renderPrevButton: () => Unit = null,
    renderSkipButton: () => Unit = null,
    showDoneButton: js.UndefOr[Boolean] = js.undefined,
    showNextButton: js.UndefOr[Boolean] = js.undefined,
    showPrevButton: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    skipLabel: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomButton)) __obj.updateDynamic("bottomButton")(bottomButton.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePagination)) __obj.updateDynamic("hidePagination")(hidePagination.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction0(onDone))
    if (onSkip != null) __obj.updateDynamic("onSkip")(js.Any.fromFunction0(onSkip))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction2(onSlideChange))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle.asInstanceOf[js.Any])
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel.asInstanceOf[js.Any])
    if (renderDoneButton != null) __obj.updateDynamic("renderDoneButton")(js.Any.fromFunction0(renderDoneButton))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    if (renderNextButton != null) __obj.updateDynamic("renderNextButton")(js.Any.fromFunction0(renderNextButton))
    if (renderPrevButton != null) __obj.updateDynamic("renderPrevButton")(js.Any.fromFunction0(renderPrevButton))
    if (renderSkipButton != null) __obj.updateDynamic("renderSkipButton")(js.Any.fromFunction0(renderSkipButton))
    if (!js.isUndefined(showDoneButton)) __obj.updateDynamic("showDoneButton")(showDoneButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton.asInstanceOf[js.Any])
    if (skipLabel != null) __obj.updateDynamic("skipLabel")(skipLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AppIntroProps
}

