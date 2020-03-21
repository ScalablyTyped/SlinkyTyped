package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.mod.NavigationControlProps
import typingsSlinky.reactMapGl.mod.ViewStateChangeInfo
import typingsSlinky.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationControl
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.NavigationControl] {
  @JSImport("react-map-gl", "NavigationControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    compassLabel: String = null,
    onViewStateChange: /* info */ ViewStateChangeInfo => Unit = null,
    onViewportChange: /* viewState */ ViewportProps => Unit = null,
    showCompass: js.UndefOr[Boolean] = js.undefined,
    showZoom: js.UndefOr[Boolean] = js.undefined,
    zoomInLabel: String = null,
    zoomOutLabel: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.NavigationControl] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (compassLabel != null) __obj.updateDynamic("compassLabel")(compassLabel.asInstanceOf[js.Any])
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1(onViewportChange))
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom.asInstanceOf[js.Any])
    if (zoomInLabel != null) __obj.updateDynamic("zoomInLabel")(zoomInLabel.asInstanceOf[js.Any])
    if (zoomOutLabel != null) __obj.updateDynamic("zoomOutLabel")(zoomOutLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.NavigationControl] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMapGl.mod.NavigationControl](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NavigationControlProps
}

