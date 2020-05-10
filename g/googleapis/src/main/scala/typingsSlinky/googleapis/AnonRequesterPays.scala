package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequesterPays extends js.Object {
  var requesterPays: js.UndefOr[Boolean] = js.native
}

object AnonRequesterPays {
  @scala.inline
  def apply(): AnonRequesterPays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRequesterPays]
  }
  @scala.inline
  implicit class AnonRequesterPaysOps[Self <: AnonRequesterPays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequesterPays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(js.undefined)
        ret
    }
  }
  
}

