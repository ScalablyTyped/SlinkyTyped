package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.bizcharts.bizchartsMod.Guide.DataMarker
import typingsSlinky.bizcharts.bizchartsMod.Guide.DataMarkerProps
import typingsSlinky.bizcharts.bizchartsStrings.downward
import typingsSlinky.bizcharts.bizchartsStrings.upward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideDataMarker
  extends ExternalComponentWithAttributesWithRefType[tag.type, DataMarker] {
  @JSImport("bizcharts", "Guide.DataMarker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: content */
  def apply(
    direction: upward | downward = null,
    display: js.Object = null,
    lineLength: Int | Double = null,
    position: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    style: js.Object = null,
    top: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, DataMarker] = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, DataMarker] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.bizcharts.bizchartsMod.Guide.DataMarker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DataMarkerProps
}

