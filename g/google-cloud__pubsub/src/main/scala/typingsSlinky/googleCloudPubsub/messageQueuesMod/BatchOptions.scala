package typingsSlinky.googleCloudPubsub.messageQueuesMod

import typingsSlinky.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchOptions extends js.Object {
  var callOptions: js.UndefOr[CallOptions] = js.native
  var maxMessages: js.UndefOr[Double] = js.native
  var maxMilliseconds: js.UndefOr[Double] = js.native
}

object BatchOptions {
  @scala.inline
  def apply(): BatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchOptions]
  }
  @scala.inline
  implicit class BatchOptionsOps[Self <: BatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallOptions(value: CallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOptions")(js.undefined)
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

