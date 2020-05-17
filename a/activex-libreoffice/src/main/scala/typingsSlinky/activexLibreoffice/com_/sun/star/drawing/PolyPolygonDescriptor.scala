package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes a poly-polygon.
  *
  * A poly-polygon consists of multiple polygons combined in one.
  */
@js.native
trait PolyPolygonDescriptor extends js.Object {
  /** These are the untransformed points of this polygon. */
  var Geometry: PointSequenceSequence = js.native
  /** These are the reference points for this polygon. */
  var PolyPolygon: PointSequenceSequence = js.native
  /** This is the type of polygon. */
  var PolygonKind: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolygonKind = js.native
}

object PolyPolygonDescriptor {
  @scala.inline
  def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygon = PolyPolygon.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
  @scala.inline
  implicit class PolyPolygonDescriptorOps[Self <: PolyPolygonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: PointSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyPolygon(value: PointSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolyPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonKind(value: PolygonKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolygonKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

