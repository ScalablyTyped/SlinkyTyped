package typingsSlinky.awsSdk.sharedIniFileCredentialsMod

import typingsSlinky.awsSdk.configMod.HTTPOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedIniFileCredentialsOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.native
  var disableAssumeRole: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  var profile: js.UndefOr[String] = js.native
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}

object SharedIniFileCredentialsOptions {
  @scala.inline
  def apply(): SharedIniFileCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedIniFileCredentialsOptions]
  }
  @scala.inline
  implicit class SharedIniFileCredentialsOptionsOps[Self <: SharedIniFileCredentialsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* err */ js.UndefOr[js.Error] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAssumeRole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAssumeRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAssumeRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAssumeRole")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOptions(value: HTTPOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenCodeFn(
      value: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCodeFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTokenCodeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCodeFn")(js.undefined)
        ret
    }
  }
  
}

