package typingsSlinky.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeverBounce extends js.Object {
  var account: Account = js.native
  var errors: js.Error = js.native
  var jobs: Jobs = js.native
  var poe: Poe = js.native
  var single: Single = js.native
  def getConfig(): Config = js.native
  def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
  def setApiKey(key: String): Unit = js.native
  def setHost(host: String): Unit = js.native
}

object NeverBounce {
  @scala.inline
  def apply(
    account: Account,
    errors: js.Error,
    getConfig: () => Config,
    getRequestOpts: ConfigOptions => ConfigOptions,
    jobs: Jobs,
    poe: Poe,
    setApiKey: String => Unit,
    setHost: String => Unit,
    single: Single
  ): NeverBounce = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getRequestOpts = js.Any.fromFunction1(getRequestOpts), jobs = jobs.asInstanceOf[js.Any], poe = poe.asInstanceOf[js.Any], setApiKey = js.Any.fromFunction1(setApiKey), setHost = js.Any.fromFunction1(setHost), single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeverBounce]
  }
  @scala.inline
  implicit class NeverBounceOps[Self <: NeverBounce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConfig(value: () => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequestOpts(value: ConfigOptions => ConfigOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequestOpts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJobs(value: Jobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoe(value: Poe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetApiKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setApiKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHost(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSingle(value: Single): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

