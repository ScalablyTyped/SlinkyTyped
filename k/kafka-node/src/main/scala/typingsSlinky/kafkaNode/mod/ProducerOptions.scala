package typingsSlinky.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerOptions extends js.Object {
  var ackTimeoutMs: js.UndefOr[Double] = js.native
  var partitionerType: js.UndefOr[Double] = js.native
  var requireAcks: js.UndefOr[Double] = js.native
}

object ProducerOptions {
  @scala.inline
  def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  @scala.inline
  implicit class ProducerOptionsOps[Self <: ProducerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeoutMs")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionerType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionerType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireAcks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAcks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireAcks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAcks")(js.undefined)
        ret
    }
  }
  
}

