package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetailed extends js.Object {
  var detailed: js.UndefOr[Boolean] = js.native
}

object AnonDetailed {
  @scala.inline
  def apply(): AnonDetailed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetailed]
  }
  @scala.inline
  implicit class AnonDetailedOps[Self <: AnonDetailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
  }
  
}

