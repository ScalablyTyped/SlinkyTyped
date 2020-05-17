package typingsSlinky.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A HitResult object contains information about the results of a hit
  * test. It is returned by {@link Item#hitTest} and
  * {@link Project#hitTest}.
  */
@js.native
trait HitResult extends js.Object {
  /** 
    * If the HitResult has a type of 'pixel', this property refers to the color
    * of the pixel on the {@link Raster} that was hit.
    */
  var color: Color | Null = js.native
  /** 
    * The item that was hit.
    */
  var item: Item = js.native
  /** 
    * If the HitResult has a type of 'curve' or 'stroke', this property gives
    * more information about the exact position that was hit on the path.
    */
  var location: CurveLocation = js.native
  /** 
    * If the HitResult has a {@link HitResult#type} of `'bounds'`, this
    * property describes which corner of the bounding rectangle was hit.
    */
  var name: String = js.native
  /** 
    * Describes the actual coordinates of the segment, handle or bounding box
    * corner that was hit.
    */
  var point: Point = js.native
  /** 
    * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or
    * 'handle-out', this property refers to the segment that was hit or that
    * is closest to the hitResult.location on the curve.
    */
  var segment: Segment = js.native
  /** 
    * Describes the type of the hit result. For example, if you hit a segment
    * point, the type would be `'segment'`.
    */
  var `type`: String = js.native
}

object HitResult {
  @scala.inline
  def apply(item: Item, location: CurveLocation, name: String, point: Point, segment: Segment, `type`: String): HitResult = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitResult]
  }
  @scala.inline
  implicit class HitResultOps[Self <: HitResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: CurveLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegment(value: Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(null)
        ret
    }
  }
  
}

