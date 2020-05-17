package typingsSlinky.googleCloudPubsub.leaseManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowControlOptions extends js.Object {
  var allowExcessMessages: js.UndefOr[Boolean] = js.native
  var maxBytes: js.UndefOr[Double] = js.native
  var maxExtension: js.UndefOr[Double] = js.native
  var maxMessages: js.UndefOr[Double] = js.native
}

object FlowControlOptions {
  @scala.inline
  def apply(): FlowControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowControlOptions]
  }
  @scala.inline
  implicit class FlowControlOptionsOps[Self <: FlowControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExcessMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExcessMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExcessMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExcessMessages")(js.undefined)
        ret
    }
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
    def withMaxExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtension")(js.undefined)
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
  }
  
}

