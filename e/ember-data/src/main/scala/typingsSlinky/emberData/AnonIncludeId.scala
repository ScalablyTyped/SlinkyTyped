package typingsSlinky.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeId extends js.Object {
  var includeId: js.UndefOr[Boolean] = js.native
}

object AnonIncludeId {
  @scala.inline
  def apply(): AnonIncludeId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeId]
  }
  @scala.inline
  implicit class AnonIncludeIdOps[Self <: AnonIncludeId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeId")(js.undefined)
        ret
    }
  }
  
}

