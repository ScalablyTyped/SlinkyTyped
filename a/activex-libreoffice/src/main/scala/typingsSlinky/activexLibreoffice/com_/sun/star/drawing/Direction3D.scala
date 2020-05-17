package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional vector. */
@js.native
trait Direction3D extends js.Object {
  var DirectionX: Double = js.native
  var DirectionY: Double = js.native
  var DirectionZ: Double = js.native
}

object Direction3D {
  @scala.inline
  def apply(DirectionX: Double, DirectionY: Double, DirectionZ: Double): Direction3D = {
    val __obj = js.Dynamic.literal(DirectionX = DirectionX.asInstanceOf[js.Any], DirectionY = DirectionY.asInstanceOf[js.Any], DirectionZ = DirectionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction3D]
  }
  @scala.inline
  implicit class Direction3DOps[Self <: Direction3D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

