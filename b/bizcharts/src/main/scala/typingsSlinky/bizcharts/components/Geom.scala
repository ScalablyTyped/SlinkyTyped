package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.bizcharts.AnonDodgeBy
import typingsSlinky.bizcharts.AnonName
import typingsSlinky.bizcharts.mod.GeomProps
import typingsSlinky.bizcharts.mod.GeomType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geom
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.bizcharts.mod.Geom] {
  @JSImport("bizcharts", "Geom")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: selected */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    adjust: String | (js.Array[AnonDodgeBy | String]) = null,
    animate: js.Any = null,
    color: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String]) = null,
    line: line | Boolean = null,
    opacity: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]]) = null,
    position: String = null,
    select: Boolean | (js.Tuple2[Boolean, _]) = null,
    shape: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])]) = null,
    size: Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
    ]) = null,
    style: js.Object | (js.Tuple2[String, js.Object]) = null,
    tooltip: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, AnonName]]) = null,
    `type`: GeomType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Geom] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (adjust != null) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Geom] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.bizcharts.mod.Geom](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GeomProps
}

