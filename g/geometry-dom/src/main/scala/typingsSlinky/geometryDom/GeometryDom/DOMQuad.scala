package typingsSlinky.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMQuad extends js.Object {
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: DOMRectReadOnly = js.native
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: DOMPoint = js.native
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: DOMPoint = js.native
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: DOMPoint = js.native
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: DOMPoint = js.native
}

object DOMQuad {
  @scala.inline
  def apply(bounds: DOMRectReadOnly, p1: DOMPoint, p2: DOMPoint, p3: DOMPoint, p4: DOMPoint): DOMQuad = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMQuad]
  }
  @scala.inline
  implicit class DOMQuadOps[Self <: DOMQuad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: DOMRectReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP1(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP2(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP3(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP4(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

