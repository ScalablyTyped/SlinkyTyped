package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.mod.ScaleControlProps
import typingsSlinky.reactMapGl.reactMapGlStrings.imperial
import typingsSlinky.reactMapGl.reactMapGlStrings.metric
import typingsSlinky.reactMapGl.reactMapGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleControl
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.ScaleControl] {
  @JSImport("react-map-gl", "ScaleControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    unit: imperial | metric | nautical = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.ScaleControl] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.ScaleControl] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMapGl.mod.ScaleControl](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScaleControlProps
}

