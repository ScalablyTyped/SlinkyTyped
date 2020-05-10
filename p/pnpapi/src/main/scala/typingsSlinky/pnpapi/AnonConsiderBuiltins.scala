package typingsSlinky.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConsiderBuiltins extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.native
}

object AnonConsiderBuiltins {
  @scala.inline
  def apply(): AnonConsiderBuiltins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConsiderBuiltins]
  }
  @scala.inline
  implicit class AnonConsiderBuiltinsOps[Self <: AnonConsiderBuiltins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsiderBuiltins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerBuiltins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderBuiltins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerBuiltins")(js.undefined)
        ret
    }
  }
  
}

