package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveIndices extends js.Object {
  var removeIndices: js.UndefOr[Boolean] = js.native
}

object AnonRemoveIndices {
  @scala.inline
  def apply(): AnonRemoveIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRemoveIndices]
  }
  @scala.inline
  implicit class AnonRemoveIndicesOps[Self <: AnonRemoveIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIndices")(js.undefined)
        ret
    }
  }
  
}

