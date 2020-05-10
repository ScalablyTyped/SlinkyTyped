package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLimit extends js.Object {
  var limit: js.UndefOr[Double] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
}

object AnonLimit {
  @scala.inline
  def apply(): AnonLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLimit]
  }
  @scala.inline
  implicit class AnonLimitOps[Self <: AnonLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(js.undefined)
        ret
    }
  }
  
}

