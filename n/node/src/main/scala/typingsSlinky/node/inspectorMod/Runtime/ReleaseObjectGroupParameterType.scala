package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseObjectGroupParameterType extends js.Object {
  /**
    * Symbolic object group name.
    */
  var objectGroup: String = js.native
}

object ReleaseObjectGroupParameterType {
  @scala.inline
  def apply(objectGroup: String): ReleaseObjectGroupParameterType = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectGroupParameterType]
  }
  @scala.inline
  implicit class ReleaseObjectGroupParameterTypeOps[Self <: ReleaseObjectGroupParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

