package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.PolygonPoint
import typingsSlinky.recharts.rechartsMod.PolygonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Polygon
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.Polygon] {
  @JSImport("recharts", "Polygon")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart */
  def apply(points: js.Array[PolygonPoint] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Polygon] = {
    val __obj = js.Dynamic.literal()
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Polygon] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.Polygon](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PolygonProps
}

