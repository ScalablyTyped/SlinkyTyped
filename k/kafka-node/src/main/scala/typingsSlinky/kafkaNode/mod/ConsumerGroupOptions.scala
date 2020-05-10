package typingsSlinky.kafkaNode.mod

import typingsSlinky.kafkaNode.kafkaNodeStrings.buffer
import typingsSlinky.kafkaNode.kafkaNodeStrings.earliest
import typingsSlinky.kafkaNode.kafkaNodeStrings.latest
import typingsSlinky.kafkaNode.kafkaNodeStrings.none
import typingsSlinky.kafkaNode.kafkaNodeStrings.range
import typingsSlinky.kafkaNode.kafkaNodeStrings.roundrobin
import typingsSlinky.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerGroupOptions extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.native
  var autoCommitIntervalMs: js.UndefOr[Double] = js.native
  var batch: js.UndefOr[AckBatchOptions] = js.native
  var connectOnReady: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[buffer | utf8] = js.native
  var fetchMaxBytes: js.UndefOr[Double] = js.native
  var fetchMaxWaitMs: js.UndefOr[Double] = js.native
  var fetchMinBytes: js.UndefOr[Double] = js.native
  var fromOffset: js.UndefOr[earliest | latest | none] = js.native
  var groupId: String = js.native
  var heartbeatInterval: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var kafkaHost: js.UndefOr[String] = js.native
  var keyEncoding: js.UndefOr[buffer | utf8] = js.native
  var maxNumSegments: js.UndefOr[Double] = js.native
  var maxTickMessages: js.UndefOr[Double] = js.native
  var migrateHLC: js.UndefOr[Boolean] = js.native
  var migrateRolling: js.UndefOr[Boolean] = js.native
  var onRebalance: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  var outOfRangeOffset: js.UndefOr[earliest | latest | none] = js.native
  var protocol: js.UndefOr[js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]] = js.native
  var retries: js.UndefOr[Double] = js.native
  var retryFactor: js.UndefOr[Double] = js.native
  var retryMinTimeout: js.UndefOr[Double] = js.native
  var sasl: js.UndefOr[js.Any] = js.native
  var sessionTimeout: js.UndefOr[Double] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var sslOptions: js.UndefOr[js.Any] = js.native
}

object ConsumerGroupOptions {
  @scala.inline
  def apply(groupId: String): ConsumerGroupOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupOptions]
  }
  @scala.inline
  implicit class ConsumerGroupOptionsOps[Self <: ConsumerGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCommitIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommitIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommitIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommitIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch(value: AckBatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectOnReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectOnReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectOnReady")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: buffer | utf8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMaxBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMaxBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMaxBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMaxBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMaxWaitMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMaxWaitMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMaxWaitMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMaxWaitMs")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMinBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMinBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMinBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMinBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withFromOffset(value: earliest | latest | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaHost")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncoding(value: buffer | utf8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTickMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTickMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTickMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTickMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrateHLC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateHLC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrateHLC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateHLC")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrateRolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateRolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrateRolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrateRolling")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRebalance(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRebalance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRebalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRebalance")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfRangeOffset(value: earliest | latest | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfRangeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryMinTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryMinTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryMinTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryMinTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSasl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSasl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSslOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(js.undefined)
        ret
    }
  }
  
}

