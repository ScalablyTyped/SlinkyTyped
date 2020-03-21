package typingsSlinky.reactNativeAwesomeCardIo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardDetails
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardIODetectionMode
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardIOViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardIOView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeAwesomeCardIo.mod.CardIOView] {
  @JSImport("react-native-awesome-card-io", "CardIOView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    didScanCard: CardDetails => Unit,
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    guideColor: String | Double = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeAwesomeCardIo.mod.CardIOView] = {
    val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide.asInstanceOf[js.Any])
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode.asInstanceOf[js.Any])
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo.asInstanceOf[js.Any])
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry.asInstanceOf[js.Any])
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions.asInstanceOf[js.Any])
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardIOViewProps
}

