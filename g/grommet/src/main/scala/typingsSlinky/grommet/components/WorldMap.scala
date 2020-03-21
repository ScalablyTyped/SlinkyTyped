package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.AnonLight
import typingsSlinky.grommet.AnonLocation
import typingsSlinky.grommet.AnonName
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.worldMapMod.WorldMapProps
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WorldMap
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.mod.WorldMap] {
  @JSImport("grommet", "WorldMap")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    color: ColorType = null,
    continents: js.Array[AnonName] = null,
    fill: FillType = null,
    gridArea: GridAreaType = null,
    hoverColor: String | AnonLight = null,
    margin: MarginType = null,
    onSelectPlace: /* place */ js.Array[Double] => Unit = null,
    places: js.Array[AnonLocation] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.grommet.mod.WorldMap] = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(js.Any.fromFunction1(onSelectPlace))
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.grommet.mod.WorldMap] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.grommet.mod.WorldMap](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WorldMapProps with SVGProps[SVGSVGElement]
}

