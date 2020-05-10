package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeometry extends js.Object {
  @JSName("$geometry")
  var $geometry: js.Object = js.native
}

object AnonGeometry {
  @scala.inline
  def apply($geometry: js.Object): AnonGeometry = {
    val __obj = js.Dynamic.literal($geometry = $geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometry]
  }
  @scala.inline
  implicit class AnonGeometryOps[Self <: AnonGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$geometry(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$geometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

