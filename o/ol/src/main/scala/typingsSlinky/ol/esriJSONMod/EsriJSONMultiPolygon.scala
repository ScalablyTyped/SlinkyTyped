package typingsSlinky.ol.esriJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsriJSONMultiPolygon extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
  var rings: js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
  var spatialReference: js.UndefOr[EsriJSONSpatialReferenceWkid] = js.native
}

object EsriJSONMultiPolygon {
  @scala.inline
  def apply(rings: js.Array[js.Array[js.Array[js.Array[Double]]]]): EsriJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsriJSONMultiPolygon]
  }
  @scala.inline
  implicit class EsriJSONMultiPolygonOps[Self <: EsriJSONMultiPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRings(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasM")(js.undefined)
        ret
    }
    @scala.inline
    def withHasZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasZ")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: EsriJSONSpatialReferenceWkid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
  }
  
}

