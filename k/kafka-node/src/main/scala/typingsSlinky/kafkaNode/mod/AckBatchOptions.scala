package typingsSlinky.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckBatchOptions extends js.Object {
  var noAckBatchAge: Double | Null = js.native
  var noAckBatchSize: Double | Null = js.native
}

object AckBatchOptions {
  @scala.inline
  def apply(): AckBatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AckBatchOptions]
  }
  @scala.inline
  implicit class AckBatchOptionsOps[Self <: AckBatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoAckBatchAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAckBatchAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoAckBatchAgeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAckBatchAge")(null)
        ret
    }
    @scala.inline
    def withNoAckBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAckBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoAckBatchSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAckBatchSize")(null)
        ret
    }
  }
  
}

