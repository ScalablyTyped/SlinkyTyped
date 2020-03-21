package typingsSlinky.reactQrReader.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.img.tag
import typingsSlinky.reactQrReader.mod.^
import typingsSlinky.reactQrReader.mod.props
import typingsSlinky.reactQrReader.reactQrReaderBooleans.`false`
import typingsSlinky.reactQrReader.reactQrReaderStrings.environment
import typingsSlinky.reactQrReader.reactQrReaderStrings.user
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQrReader
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onError: js.Any => Unit,
    onScan: js.UndefOr[String] => Unit,
    delay: Double | `false` = null,
    facingMode: user | environment = null,
    legacyMode: js.UndefOr[Boolean] = js.undefined,
    onImageLoad: /* event */ SyntheticEvent[Event_, HTMLImageElement] => Unit = null,
    onLoad: () => Unit = null,
    resolution: Int | Double = null,
    showViewFinder: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onScan = js.Any.fromFunction1(onScan))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyMode)) __obj.updateDynamic("legacyMode")(legacyMode.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(showViewFinder)) __obj.updateDynamic("showViewFinder")(showViewFinder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = props
}

