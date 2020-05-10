package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSkipAllPausesParameterType extends js.Object {
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean = js.native
}

object SetSkipAllPausesParameterType {
  @scala.inline
  def apply(skip: Boolean): SetSkipAllPausesParameterType = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSkipAllPausesParameterType]
  }
  @scala.inline
  implicit class SetSkipAllPausesParameterTypeOps[Self <: SetSkipAllPausesParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

