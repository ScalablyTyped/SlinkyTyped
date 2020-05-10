package typingsSlinky.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaSettings extends js.Object {
  /** Kafka broker host name */
  var kafkaHost: String = js.native
}

object KafkaSettings {
  @scala.inline
  def apply(kafkaHost: String): KafkaSettings = {
    val __obj = js.Dynamic.literal(kafkaHost = kafkaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaSettings]
  }
  @scala.inline
  implicit class KafkaSettingsOps[Self <: KafkaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKafkaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaHost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

