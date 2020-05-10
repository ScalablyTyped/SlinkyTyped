package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreOwnVariables extends js.Object {
  var ignoreOwnVariables: Boolean = js.native
}

object AnonIgnoreOwnVariables {
  @scala.inline
  def apply(ignoreOwnVariables: Boolean): AnonIgnoreOwnVariables = {
    val __obj = js.Dynamic.literal(ignoreOwnVariables = ignoreOwnVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreOwnVariables]
  }
  @scala.inline
  implicit class AnonIgnoreOwnVariablesOps[Self <: AnonIgnoreOwnVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreOwnVariables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreOwnVariables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

