package typingsSlinky.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAndLockOptions extends js.Object {
  var lockTime: js.UndefOr[Double] = js.native
}

object GetAndLockOptions {
  @scala.inline
  def apply(): GetAndLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAndLockOptions]
  }
  @scala.inline
  implicit class GetAndLockOptionsOps[Self <: GetAndLockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTime")(js.undefined)
        ret
    }
  }
  
}

