package typingsSlinky.geometryDashDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMQuad extends js.Object {
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: typingsSlinky.geometryDashDom.GeometryDom.DOMRectReadOnly
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
}

object DOMQuad {
  @scala.inline
  def apply(
    bounds: typingsSlinky.geometryDashDom.GeometryDom.DOMRectReadOnly,
    p1: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint,
    p2: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint,
    p3: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint,
    p4: typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMQuad]
  }
}

