package typingsSlinky.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerStreamOptions extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.native
  var kafkaClient: js.UndefOr[KafkaClientOptions] = js.native
  var producer: js.UndefOr[ProducerOptions] = js.native
}

object ProducerStreamOptions {
  @scala.inline
  def apply(): ProducerStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerStreamOptions]
  }
  @scala.inline
  implicit class ProducerStreamOptionsOps[Self <: ProducerStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaClient(value: KafkaClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaClient")(js.undefined)
        ret
    }
    @scala.inline
    def withProducer(value: ProducerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(js.undefined)
        ret
    }
  }
  
}

