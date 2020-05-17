package typingsSlinky.googleCloudPubsub.publisherMod

import typingsSlinky.googleCloudPubsub.messageBatchMod.BatchPublishOptions
import typingsSlinky.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishOptions extends js.Object {
  var batching: js.UndefOr[BatchPublishOptions] = js.native
  var gaxOpts: js.UndefOr[CallOptions] = js.native
  var messageOrdering: js.UndefOr[Boolean] = js.native
}

object PublishOptions {
  @scala.inline
  def apply(): PublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOptions]
  }
  @scala.inline
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatching(value: BatchPublishOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(js.undefined)
        ret
    }
    @scala.inline
    def withGaxOpts(value: CallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaxOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageOrdering")(js.undefined)
        ret
    }
  }
  
}

