package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizeLimit extends js.Object {
  var sizeLimit: js.UndefOr[Double | String] = js.native
}

object AnonSizeLimit {
  @scala.inline
  def apply(): AnonSizeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSizeLimit]
  }
  @scala.inline
  implicit class AnonSizeLimitOps[Self <: AnonSizeLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeLimit(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(js.undefined)
        ret
    }
  }
  
}

