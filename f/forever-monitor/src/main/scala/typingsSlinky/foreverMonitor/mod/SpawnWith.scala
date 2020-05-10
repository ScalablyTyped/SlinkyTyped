package typingsSlinky.foreverMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnWith extends js.Object {
  var customFds: js.Array[Double] = js.native
  var gid: Double = js.native
  var setsid: Boolean = js.native
  var uid: Double = js.native
}

object SpawnWith {
  @scala.inline
  def apply(customFds: js.Array[Double], gid: Double, setsid: Boolean, uid: Double): SpawnWith = {
    val __obj = js.Dynamic.literal(customFds = customFds.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], setsid = setsid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnWith]
  }
  @scala.inline
  implicit class SpawnWithOps[Self <: SpawnWith] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetsid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

