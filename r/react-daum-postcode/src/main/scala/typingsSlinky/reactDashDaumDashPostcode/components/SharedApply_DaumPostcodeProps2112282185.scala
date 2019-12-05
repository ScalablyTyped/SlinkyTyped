package typingsSlinky.reactDashDaumDashPostcode.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDaumDashPostcode.reactDashDaumDashPostcodeMod.AddressData
import typingsSlinky.reactDashDaumDashPostcode.reactDashDaumDashPostcodeMod.DaumPostcodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DaumPostcodeProps2112282185[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: height, width */
  def apply(
    onComplete: AddressData => Unit,
    alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoMapping: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    defaultQuery: String = null,
    errorMessage: ReactElement = null,
    hideEngBtn: js.UndefOr[Boolean] = js.undefined,
    hideMapBtn: js.UndefOr[Boolean] = js.undefined,
    maxSuggestItems: Int | Double = null,
    pleaseReadGuide: Int | Double = null,
    pleaseReadGuideTimer: Int | Double = null,
    scriptUrl: String = null,
    shorthand: js.UndefOr[Boolean] = js.undefined,
    showMoreHName: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: js.Object = null,
    useSuggest: js.UndefOr[Boolean] = js.undefined,
    zonecodeOnly: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(alwaysShowEngAddr)) __obj.updateDynamic("alwaysShowEngAddr")(alwaysShowEngAddr.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMapping)) __obj.updateDynamic("autoMapping")(autoMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (defaultQuery != null) __obj.updateDynamic("defaultQuery")(defaultQuery.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEngBtn)) __obj.updateDynamic("hideEngBtn")(hideEngBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMapBtn)) __obj.updateDynamic("hideMapBtn")(hideMapBtn.asInstanceOf[js.Any])
    if (maxSuggestItems != null) __obj.updateDynamic("maxSuggestItems")(maxSuggestItems.asInstanceOf[js.Any])
    if (pleaseReadGuide != null) __obj.updateDynamic("pleaseReadGuide")(pleaseReadGuide.asInstanceOf[js.Any])
    if (pleaseReadGuideTimer != null) __obj.updateDynamic("pleaseReadGuideTimer")(pleaseReadGuideTimer.asInstanceOf[js.Any])
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.asInstanceOf[js.Any])
    if (!js.isUndefined(showMoreHName)) __obj.updateDynamic("showMoreHName")(showMoreHName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useSuggest)) __obj.updateDynamic("useSuggest")(useSuggest.asInstanceOf[js.Any])
    if (!js.isUndefined(zonecodeOnly)) __obj.updateDynamic("zonecodeOnly")(zonecodeOnly.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DaumPostcodeProps
}

