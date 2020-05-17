package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ray extends js.Object {
  var checkCollisionResponse: Boolean = js.native
  var from: Vec3 = js.native
  var precision: Double = js.native
  var to: Vec3 = js.native
  def getAABB(result: RaycastResult): Unit = js.native
}

object Ray {
  @scala.inline
  def apply(
    checkCollisionResponse: Boolean,
    from: Vec3,
    getAABB: RaycastResult => Unit,
    precision: Double,
    to: Vec3
  ): Ray = {
    val __obj = js.Dynamic.literal(checkCollisionResponse = checkCollisionResponse.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getAABB = js.Any.fromFunction1(getAABB), precision = precision.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ray]
  }
  @scala.inline
  implicit class RayOps[Self <: Ray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckCollisionResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollisionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAABB(value: RaycastResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAABB")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

