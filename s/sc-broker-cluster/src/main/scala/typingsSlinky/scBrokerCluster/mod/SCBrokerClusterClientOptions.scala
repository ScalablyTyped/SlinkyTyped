package typingsSlinky.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerClusterClientOptions extends js.Object {
  var brokers: js.Array[String] = js.native
  var connectRetryErrorThreshold: Double = js.native
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  var secretKey: js.UndefOr[String] = js.native
}

object SCBrokerClusterClientOptions {
  @scala.inline
  def apply(brokers: js.Array[String], connectRetryErrorThreshold: Double): SCBrokerClusterClientOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], connectRetryErrorThreshold = connectRetryErrorThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterClientOptions]
  }
  @scala.inline
  implicit class SCBrokerClusterClientOptionsOps[Self <: SCBrokerClusterClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectRetryErrorThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryErrorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubSubBatchDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSubBatchDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubSubBatchDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSubBatchDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
  }
  
}

