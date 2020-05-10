package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaSettings extends js.Object {
  /**
    * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form  broker-hostname-or-ip:port . For example, "ec2-12-345-678-901.compute-1.amazonaws.com:2345".
    */
  var Broker: js.UndefOr[String] = js.native
  /**
    * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies "kafka-default-topic" as the migration topic.
    */
  var Topic: js.UndefOr[String] = js.native
}

object KafkaSettings {
  @scala.inline
  def apply(): KafkaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaSettings]
  }
  @scala.inline
  implicit class KafkaSettingsOps[Self <: KafkaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Broker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Broker")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topic")(js.undefined)
        ret
    }
  }
  
}

