package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.mod.PopupProps
import typingsSlinky.reactMapGl.reactMapGlStrings.`bottom-left`
import typingsSlinky.reactMapGl.reactMapGlStrings.`bottom-right`
import typingsSlinky.reactMapGl.reactMapGlStrings.`top-left`
import typingsSlinky.reactMapGl.reactMapGlStrings.`top-right`
import typingsSlinky.reactMapGl.reactMapGlStrings.bottom
import typingsSlinky.reactMapGl.reactMapGlStrings.left
import typingsSlinky.reactMapGl.reactMapGlStrings.right
import typingsSlinky.reactMapGl.reactMapGlStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.Popup] {
  @JSImport("react-map-gl", "Popup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    latitude: Double,
    longitude: Double,
    altitude: Int | Double = null,
    anchor: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right = null,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dynamicPosition: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onClose: () => Unit = null,
    sortByDepth: js.UndefOr[Boolean] = js.undefined,
    tipSize: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Popup] = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicPosition)) __obj.updateDynamic("dynamicPosition")(dynamicPosition.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(sortByDepth)) __obj.updateDynamic("sortByDepth")(sortByDepth.asInstanceOf[js.Any])
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopupProps
}

