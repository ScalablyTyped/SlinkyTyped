package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsOpenUrlAction extends js.Object {
  /**
    * Information about the Android App if the URL is expected to be
    * fulfilled by an Android App.
    */
  var androidApp: js.UndefOr[GoogleActionsV2DevicesAndroidApp] = js.native
  /**
    * The url field which could be any of:
    * - http/https urls for opening an App-linked App or a webpage
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Indicates a hint for the url type.
    */
  var urlTypeHint: js.UndefOr[GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint] = js.native
}

object GoogleActionsV2UiElementsOpenUrlAction {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsOpenUrlAction]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsOpenUrlActionOps[Self <: GoogleActionsV2UiElementsOpenUrlAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidApp(value: GoogleActionsV2DevicesAndroidApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidApp")(js.undefined)
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
    @scala.inline
    def withUrlTypeHint(value: GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTypeHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlTypeHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTypeHint")(js.undefined)
        ret
    }
  }
  
}

