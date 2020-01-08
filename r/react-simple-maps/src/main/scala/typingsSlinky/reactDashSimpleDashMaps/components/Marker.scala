package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.svg.`*`.tag
import typingsSlinky.reactDashSimpleDashMaps.Anon_Default
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.MarkerProps
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Marker
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-simple-maps", "Marker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onBlur, onFocus, onMouseDown, onMouseEnter, onMouseLeave, onMouseUp */
  def apply(coordinates: Point = null, style: Anon_Default = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.svg.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MarkerProps
}

