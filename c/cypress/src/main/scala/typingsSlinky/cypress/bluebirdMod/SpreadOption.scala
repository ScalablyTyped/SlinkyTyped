package typingsSlinky.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadOption extends js.Object {
  var spread: Boolean = js.native
}

object SpreadOption {
  @scala.inline
  def apply(spread: Boolean): SpreadOption = {
    val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadOption]
  }
  @scala.inline
  implicit class SpreadOptionOps[Self <: SpreadOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpread(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

