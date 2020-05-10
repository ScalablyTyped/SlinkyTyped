package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsHtmlResponse extends js.Object {
  /**
    * Provide an option so that mic won't be opened after this immersive
    * response.
    */
  var suppressMic: js.UndefOr[Boolean] = js.native
  /**
    * Communicate the following JSON object to the app.
    */
  var updatedState: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * The url of the application.
    */
  var url: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsHtmlResponse {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsHtmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsHtmlResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsHtmlResponseOps[Self <: GoogleActionsV2UiElementsHtmlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressMic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMic")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedState(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedState")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

