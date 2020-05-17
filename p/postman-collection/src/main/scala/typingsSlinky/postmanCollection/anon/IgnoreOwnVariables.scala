package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreOwnVariables extends js.Object {
  var ignoreOwnVariables: Boolean = js.native
}

object IgnoreOwnVariables {
  @scala.inline
  def apply(ignoreOwnVariables: Boolean): IgnoreOwnVariables = {
    val __obj = js.Dynamic.literal(ignoreOwnVariables = ignoreOwnVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreOwnVariables]
  }
  @scala.inline
  implicit class IgnoreOwnVariablesOps[Self <: IgnoreOwnVariables] (val x: Self) extends AnyVal {
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

