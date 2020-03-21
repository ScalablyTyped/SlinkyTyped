package typingsSlinky.reactNativeSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeSvg.mod.MarkerProps
import typingsSlinky.reactNativeSvg.mod.MarkerUnits
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.Orient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Marker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSvg.mod.Marker] {
  @JSImport("react-native-svg", "Marker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    markerHeight: NumberProp = null,
    markerUnits: MarkerUnits = null,
    markerWidth: NumberProp = null,
    orient: Orient | NumberProp = null,
    preserveAspectRatio: String = null,
    refX: NumberProp = null,
    refY: NumberProp = null,
    viewBox: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSvg.mod.Marker] = {
    val __obj = js.Dynamic.literal()
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeSvg.mod.Marker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeSvg.mod.Marker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MarkerProps
}

