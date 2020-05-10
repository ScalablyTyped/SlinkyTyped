package typingsSlinky.expo.aRMod

import typingsSlinky.expo.AnonLength
import typingsSlinky.expo.aRMod.AnchorType.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Plane,   center  :expo.expo/build/AR.Vector3,   extent  :{  width  :number,   length  :number}} */
@js.native
trait PlaneAnchor extends Anchor {
  var center: Vector3 = js.native
  var extent: AnonLength = js.native
  var id: String = js.native
  var transform: Matrix = js.native
  var `type`: AnchorType with Plane = js.native
}

object PlaneAnchor {
  @scala.inline
  def apply(center: Vector3, extent: AnonLength, id: String, transform: Matrix, `type`: AnchorType with Plane): PlaneAnchor = {
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
    def withCenter(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtent(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnchorType with Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

