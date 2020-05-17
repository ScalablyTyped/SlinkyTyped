package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  var after: js.UndefOr[Double] = js.native
  var before: js.UndefOr[Double] = js.native
  var between: js.UndefOr[Double] = js.native
  var channelId: String = js.native
  var dtmf: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object After {
  @scala.inline
  def apply(channelId: String): After = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBetween(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.undefined)
        ret
    }
    @scala.inline
    def withDtmf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtmf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtmf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtmf")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

