package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.format.Feature
import typingsSlinky.openlayers.mod.geom.Point
import typingsSlinky.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var distance: js.UndefOr[Double] = js.native
  var extent: js.UndefOr[Extent_] = js.native
  var format: js.UndefOr[Feature] = js.native
  var geometryFunction: js.UndefOr[js.Function1[/* feature */ typingsSlinky.openlayers.mod.Feature, Point]] = js.native
  var logo: js.UndefOr[String] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var source: Vector = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object ClusterOptions {
  @scala.inline
  def apply(source: Vector): ClusterOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributions(value: AttributionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: Extent_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryFunction(value: /* feature */ typingsSlinky.openlayers.mod.Feature => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGeometryFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
  }
  
}

