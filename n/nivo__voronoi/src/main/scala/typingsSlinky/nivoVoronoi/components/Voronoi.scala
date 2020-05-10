package typingsSlinky.nivoVoronoi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoVoronoi.mod.VoronoiCustomLayer
import typingsSlinky.nivoVoronoi.mod.VoronoiDatum
import typingsSlinky.nivoVoronoi.mod.VoronoiDomain
import typingsSlinky.nivoVoronoi.mod.VoronoiProps
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.bounds
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.cells
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.links
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Voronoi {
  @JSImport("@nivo/voronoi", "Voronoi")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoVoronoi.mod.Voronoi] {
    @scala.inline
    def cellLineColor(value: String): this.type = set("cellLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def cellLineWidth(value: Double): this.type = set("cellLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def enableCells(value: Boolean): this.type = set("enableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def enableLinks(value: Boolean): this.type = set("enableLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def enablePoints(value: Boolean): this.type = set("enablePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def layers(value: js.Array[links | cells | points | bounds | VoronoiCustomLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def linkLineColor(value: String): this.type = set("linkLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def linkLineWidth(value: Double): this.type = set("linkLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def pointColor(value: String): this.type = set("pointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointSize(value: Double): this.type = set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def xDomain(value: VoronoiDomain): this.type = set("xDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def yDomain(value: VoronoiDomain): this.type = set("yDomain", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VoronoiProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[VoronoiDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VoronoiProps with Dimensions]))
  }
}

