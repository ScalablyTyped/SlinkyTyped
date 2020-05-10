package typingsSlinky.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueData extends js.Object {
  var failures: js.UndefOr[Double] = js.native
  var messages: js.Array[String] = js.native
  var server: String = js.native
  var tokens: js.Tuple2[String, String] = js.native
  var totalDownTime: js.UndefOr[Double] = js.native
  var totalFailures: js.UndefOr[Double] = js.native
  var totalReconnectsAttempted: js.UndefOr[Double] = js.native
  var totalReconnectsFailed: js.UndefOr[Double] = js.native
  var totalReconnectsSuccess: js.UndefOr[Double] = js.native
}

object IssueData {
  @scala.inline
  def apply(messages: js.Array[String], server: String, tokens: js.Tuple2[String, String]): IssueData = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
  @scala.inline
  implicit class IssueDataOps[Self <: IssueData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDownTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDownTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDownTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDownTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalReconnectsAttempted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsAttempted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalReconnectsAttempted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsAttempted")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalReconnectsFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalReconnectsFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalReconnectsSuccess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalReconnectsSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReconnectsSuccess")(js.undefined)
        ret
    }
  }
  
}

