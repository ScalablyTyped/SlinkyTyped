package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.mod.CanvasOverlayProps
import typingsSlinky.reactMapGl.mod.CanvasRedrawOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CanvasOverlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.CanvasOverlay] {
  @JSImport("react-map-gl", "CanvasOverlay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    redraw: CanvasRedrawOptions => Unit,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.CanvasOverlay] = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CanvasOverlayProps
}

