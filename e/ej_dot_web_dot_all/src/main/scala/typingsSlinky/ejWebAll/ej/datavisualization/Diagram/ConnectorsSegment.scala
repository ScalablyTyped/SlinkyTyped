package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsSegment extends js.Object {
  /** Sets the direction of orthogonal segment
    */
  var direction: js.UndefOr[String] = js.native
  /** Describes the length of orthogonal segment
    * @Default {undefined}
    */
  var length: js.UndefOr[Double] = js.native
  /** Describes the end point of bezier/straight segment
    * @Default {Diagram.Point()}
    */
  var point: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Defines the first control point of the bezier segment
    * @Default {null}
    */
  var point1: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Defines the second control point of bezier segment
    * @Default {null}
    */
  var point2: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Sets the type of the segment.
    * @Default {ej.datavisualization.Diagram.Segments.Straight}
    */
  var `type`: js.UndefOr[Segments | String] = js.native
  /** Describes the length and angle between the first control point and the start point of bezier segment
    * @Default {null}
    */
  var vector1: js.UndefOr[js.Any] = js.native
  /** Describes the length and angle between the second control point and end point of bezier segment
    * @Default {null}
    */
  var vector2: js.UndefOr[js.Any] = js.native
}

object ConnectorsSegment {
  @scala.inline
  def apply(): ConnectorsSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsSegment]
  }
  @scala.inline
  implicit class ConnectorsSegmentOps[Self <: ConnectorsSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint1(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point1")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint2(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point2")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Segments | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVector1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVector1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector1")(js.undefined)
        ret
    }
    @scala.inline
    def withVector2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVector2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector2")(js.undefined)
        ret
    }
  }
  
}

