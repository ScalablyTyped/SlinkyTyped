package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerSoftwareInfo extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[string] = js.native
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[long] = js.native
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.native
}

object BrokerSoftwareInfo {
  @scala.inline
  def apply(): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
  @scala.inline
  implicit class BrokerSoftwareInfoOps[Self <: BrokerSoftwareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationRevision(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersion")(js.undefined)
        ret
    }
  }
  
}

