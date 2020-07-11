package typingsSlinky.expo.aRMod

import typingsSlinky.expo.aRMod.AnchorType.Plane
import typingsSlinky.expo.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type :expo.expo/build/AR.AnchorType.Plane,   center :expo.expo/build/AR.Vector3,   extent :{  width :number,   length :number}} */
trait PlaneAnchor extends Anchor {
  var center: Vector3
  var extent: Length
  var id: String
  var transform: Matrix
  var `type`: AnchorType with Plane
}

object PlaneAnchor {
  @scala.inline
  def apply(center: Vector3, extent: Length, id: String, transform: Matrix, `type`: AnchorType with Plane): PlaneAnchor = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaneAnchor]
  }
  @scala.inline
  implicit class PlaneAnchorOps[Self <: PlaneAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenter(value: Vector3): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: Length): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AnchorType with Plane): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

