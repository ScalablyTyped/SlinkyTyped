package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueToLocationParameterType extends js.Object {
  /**
    * Location to continue to.
    */
  var location: Location = js.native
  var targetCallFrames: js.UndefOr[String] = js.native
}

object ContinueToLocationParameterType {
  @scala.inline
  def apply(location: Location): ContinueToLocationParameterType = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueToLocationParameterType]
  }
  @scala.inline
  implicit class ContinueToLocationParameterTypeOps[Self <: ContinueToLocationParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCallFrames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCallFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCallFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCallFrames")(js.undefined)
        ret
    }
  }
  
}

