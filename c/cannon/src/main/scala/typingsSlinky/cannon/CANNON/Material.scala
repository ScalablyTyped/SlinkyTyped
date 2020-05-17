package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Material extends js.Object {
  var friction: Double = js.native
  var id: Double = js.native
  var name: String = js.native
  var restitution: Double = js.native
}

object Material {
  @scala.inline
  def apply(friction: Double, id: Double, name: String, restitution: Double): Material = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
  @scala.inline
  implicit class MaterialOps[Self <: Material] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

