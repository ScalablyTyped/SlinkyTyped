package typingsSlinky.atNivoVoronoi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.VoronoiCustomLayer
import typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.VoronoiDatum
import typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.VoronoiDomain
import typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.VoronoiProps
import typingsSlinky.atNivoVoronoi.atNivoVoronoiStrings.bounds
import typingsSlinky.atNivoVoronoi.atNivoVoronoiStrings.cells
import typingsSlinky.atNivoVoronoi.atNivoVoronoiStrings.links
import typingsSlinky.atNivoVoronoi.atNivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveVoroinoi
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.ResponsiveVoroinoi] {
  @JSImport("@nivo/voronoi", "ResponsiveVoroinoi")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[VoronoiDatum],
    cellLineColor: String = null,
    cellLineWidth: Int | Double = null,
    enableCells: js.UndefOr[Boolean] = js.undefined,
    enableLinks: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[links | cells | points | bounds | VoronoiCustomLayer] = null,
    linkLineColor: String = null,
    linkLineWidth: Int | Double = null,
    margin: Box = null,
    pointColor: String = null,
    pointSize: Int | Double = null,
    theme: Theme = null,
    xDomain: VoronoiDomain = null,
    yDomain: VoronoiDomain = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoVoronoi.atNivoVoronoiMod.ResponsiveVoroinoi] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (cellLineColor != null) __obj.updateDynamic("cellLineColor")(cellLineColor.asInstanceOf[js.Any])
    if (cellLineWidth != null) __obj.updateDynamic("cellLineWidth")(cellLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCells)) __obj.updateDynamic("enableCells")(enableCells.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (linkLineColor != null) __obj.updateDynamic("linkLineColor")(linkLineColor.asInstanceOf[js.Any])
    if (linkLineWidth != null) __obj.updateDynamic("linkLineWidth")(linkLineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (xDomain != null) __obj.updateDynamic("xDomain")(xDomain.asInstanceOf[js.Any])
    if (yDomain != null) __obj.updateDynamic("yDomain")(yDomain.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = VoronoiProps
}

