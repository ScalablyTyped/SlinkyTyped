package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checksum extends js.Object {
  var checksum: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var returnAll: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[typingsSlinky.iotaLibJs.mod.Security] = js.native
  var total: js.UndefOr[Double] = js.native
}

object Checksum {
  @scala.inline
  def apply(): Checksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checksum]
  }
  @scala.inline
  implicit class ChecksumOps[Self <: Checksum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: typingsSlinky.iotaLibJs.mod.Security): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

