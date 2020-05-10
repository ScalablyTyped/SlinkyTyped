package typingsSlinky.nodeInsights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var accountId: String = js.native
  var defaultEventType: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var insertKey: String = js.native
  var maxPending: js.UndefOr[Double] = js.native
  var queryKey: String = js.native
  var timerInterval: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(accountId: String, insertKey: String, queryKey: String): Config = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], insertKey = insertKey.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPending")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerInterval")(js.undefined)
        ret
    }
  }
  
}

