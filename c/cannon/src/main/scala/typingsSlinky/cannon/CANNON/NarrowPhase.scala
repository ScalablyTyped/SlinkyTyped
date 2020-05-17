package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NarrowPhase extends js.Object {
  var contactPointPool: js.Array[Pool] = js.native
  var v3pool: Vec3Pool = js.native
}

object NarrowPhase {
  @scala.inline
  def apply(contactPointPool: js.Array[Pool], v3pool: Vec3Pool): NarrowPhase = {
    val __obj = js.Dynamic.literal(contactPointPool = contactPointPool.asInstanceOf[js.Any], v3pool = v3pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowPhase]
  }
  @scala.inline
  implicit class NarrowPhaseOps[Self <: NarrowPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactPointPool(value: js.Array[Pool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPointPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV3pool(value: Vec3Pool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v3pool")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

