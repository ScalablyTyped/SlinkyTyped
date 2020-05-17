package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortTransactionOnError extends js.Object {
  var abortTransactionOnError: js.UndefOr[Boolean] = js.native
  var appName: js.UndefOr[String] = js.native
  var encrypt: js.UndefOr[Boolean] = js.native
  var instanceName: js.UndefOr[String] = js.native
  var tdsVersion: js.UndefOr[String] = js.native
  var trustedConnection: js.UndefOr[Boolean] = js.native
  var useUTC: js.UndefOr[Boolean] = js.native
}

object AbortTransactionOnError {
  @scala.inline
  def apply(): AbortTransactionOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortTransactionOnError]
  }
  @scala.inline
  implicit class AbortTransactionOnErrorOps[Self <: AbortTransactionOnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortTransactionOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortTransactionOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortTransactionOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortTransactionOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTdsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustedConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(js.undefined)
        ret
    }
  }
  
}

