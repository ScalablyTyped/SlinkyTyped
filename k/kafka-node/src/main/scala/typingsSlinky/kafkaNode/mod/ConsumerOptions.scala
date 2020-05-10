package typingsSlinky.kafkaNode.mod

import typingsSlinky.kafkaNode.kafkaNodeStrings.buffer
import typingsSlinky.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerOptions extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.native
  var autoCommitIntervalMs: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[buffer | utf8] = js.native
  var fetchMaxBytes: js.UndefOr[Double] = js.native
  var fetchMaxWaitMs: js.UndefOr[Double] = js.native
  var fetchMinBytes: js.UndefOr[Double] = js.native
  var fromOffset: js.UndefOr[Boolean] = js.native
  var groupId: js.UndefOr[String] = js.native
  var keyEncoding: js.UndefOr[buffer | utf8] = js.native
}

object ConsumerOptions {
  @scala.inline
  def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  @scala.inline
  implicit class ConsumerOptionsOps[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFromOffset(value: Boolean): Self = {
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
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
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
  }
  
}

