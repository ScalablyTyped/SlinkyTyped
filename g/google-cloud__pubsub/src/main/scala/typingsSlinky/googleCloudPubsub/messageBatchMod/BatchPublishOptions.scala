package typingsSlinky.googleCloudPubsub.messageBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPublishOptions extends js.Object {
  var maxBytes: js.UndefOr[Double] = js.native
  var maxMessages: js.UndefOr[Double] = js.native
  var maxMilliseconds: js.UndefOr[Double] = js.native
}

object BatchPublishOptions {
  @scala.inline
  def apply(): BatchPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPublishOptions]
  }
  @scala.inline
  implicit class BatchPublishOptionsOps[Self <: BatchPublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMilliseconds")(js.undefined)
        ret
    }
  }
  
}

