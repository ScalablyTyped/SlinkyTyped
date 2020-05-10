package typingsSlinky.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var accountKey: PrivateKeyBuffer | PrivateKeyString = js.native
  var accountUrl: js.UndefOr[String] = js.native
  var backoffAttempts: js.UndefOr[Double] = js.native
  var backoffMax: js.UndefOr[Double] = js.native
  var backoffMin: js.UndefOr[Double] = js.native
  var directoryUrl: String = js.native
}

object ClientOptions {
  @scala.inline
  def apply(accountKey: PrivateKeyBuffer | PrivateKeyString, directoryUrl: String): ClientOptions = {
    val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountKey(value: PrivateKeyBuffer | PrivateKeyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMax")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffMin")(js.undefined)
        ret
    }
  }
  
}

