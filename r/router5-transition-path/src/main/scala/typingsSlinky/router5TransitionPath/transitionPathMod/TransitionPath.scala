package typingsSlinky.router5TransitionPath.transitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPath extends js.Object {
  var intersection: String = js.native
  var toActivate: js.Array[String] = js.native
  var toDeactivate: js.Array[String] = js.native
}

object TransitionPath {
  @scala.inline
  def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
    val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], toActivate = toActivate.asInstanceOf[js.Any], toDeactivate = toDeactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPath]
  }
  @scala.inline
  implicit class TransitionPathOps[Self <: TransitionPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntersection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToActivate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDeactivate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

