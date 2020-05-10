package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  var baseApiUrl: js.UndefOr[String] = js.native
  var filepath: js.UndefOr[Boolean] = js.native
  var onlyFirstMatch: js.UndefOr[Boolean] = js.native
  var polling: js.UndefOr[Boolean | PollingOptions] = js.native
  var request: js.UndefOr[Options] = js.native
  var webHook: js.UndefOr[Boolean | WebHookOptions] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseApiUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseApiUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilepath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyFirstMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFirstMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyFirstMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFirstMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withPolling(value: Boolean | PollingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withWebHook(value: Boolean | WebHookOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webHook")(js.undefined)
        ret
    }
  }
  
}

