package typingsSlinky.mailgunJs.mod.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchData extends SendData {
  var `recipient-variables`: js.UndefOr[BatchSendRecipientVars] = js.native
}

object BatchData {
  @scala.inline
  def apply(to: String | js.Array[String]): BatchData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchData]
  }
  @scala.inline
  implicit class BatchDataOps[Self <: BatchData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withRecipient-variables`(value: BatchSendRecipientVars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient-variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRecipient-variables`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient-variables")(js.undefined)
        ret
    }
  }
  
}

