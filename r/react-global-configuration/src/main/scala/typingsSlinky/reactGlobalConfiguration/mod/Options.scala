package typingsSlinky.reactGlobalConfiguration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var assign: Boolean = js.native
  var freeze: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(assign: Boolean, freeze: Boolean): Options = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeze(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

