package typingsSlinky.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultConnectionPointArguments extends js.Object {
  var offset: js.UndefOr[Double] = js.native
}

object DefaultConnectionPointArguments {
  @scala.inline
  def apply(): DefaultConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultConnectionPointArguments]
  }
  @scala.inline
  implicit class DefaultConnectionPointArgumentsOps[Self <: DefaultConnectionPointArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

