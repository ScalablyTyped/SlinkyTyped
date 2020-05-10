package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitDiscardOptions extends js.Object {
  /**
  	 * Whether the logs should be included in those of the parent test.
  	 */
  var retainLogs: js.UndefOr[Boolean] = js.native
}

object CommitDiscardOptions {
  @scala.inline
  def apply(): CommitDiscardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiscardOptions]
  }
  @scala.inline
  implicit class CommitDiscardOptionsOps[Self <: CommitDiscardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetainLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLogs")(js.undefined)
        ret
    }
  }
  
}

