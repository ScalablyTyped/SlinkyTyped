package typingsSlinky.naverWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovedResult extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean = js.native
  /** Optional. */
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object RemovedResult {
  @scala.inline
  def apply(allHistory: Boolean): RemovedResult = {
    val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedResult]
  }
  @scala.inline
  implicit class RemovedResultOps[Self <: RemovedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

