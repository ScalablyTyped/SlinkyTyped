package typingsSlinky.googleapis.texttospeechV1Mod.texttospeechV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceVoicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional (but recommended)
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
    * specified, the ListVoices call will only return voices that can be used
    * to synthesize this language_code. E.g. when specifying "en-NZ", you will
    * get supported "en-*" voices; when specifying "no", you will get supported
    * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
    * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
    * supported "yue-*" voices.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object ParamsResourceVoicesList {
  @scala.inline
  def apply(): ParamsResourceVoicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVoicesList]
  }
  @scala.inline
  implicit class ParamsResourceVoicesListOps[Self <: ParamsResourceVoicesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
  }
  
}

