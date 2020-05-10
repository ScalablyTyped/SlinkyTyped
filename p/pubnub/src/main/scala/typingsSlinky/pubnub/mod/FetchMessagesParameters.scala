package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMessagesParameters extends js.Object {
  var channels: js.Array[String] = js.native
  var count: js.UndefOr[Double] = js.native
   // timetoken
  var end: js.UndefOr[String | Double] = js.native
  var includeMessageActions: js.UndefOr[Boolean] = js.native
  var includeMeta: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[String | Double] = js.native
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.native
   // timetoken
  var withMessageActions: js.UndefOr[Boolean] = js.native
}

object FetchMessagesParameters {
  @scala.inline
  def apply(channels: js.Array[String]): FetchMessagesParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesParameters]
  }
  @scala.inline
  implicit class FetchMessagesParametersOps[Self <: FetchMessagesParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMessageActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMessageActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMessageActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMessageActions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifiedTimeToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifiedTimeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringifiedTimeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifiedTimeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWithMessageActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMessageActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithMessageActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMessageActions")(js.undefined)
        ret
    }
  }
  
}

