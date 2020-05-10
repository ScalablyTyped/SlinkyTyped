package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OpenUrlAction. */
@js.native
trait IOpenUrlAction extends js.Object {
  /** OpenUrlAction url */
  var url: js.UndefOr[String | Null] = js.native
  /** OpenUrlAction urlTypeHint */
  var urlTypeHint: js.UndefOr[UrlTypeHint | Null] = js.native
}

object IOpenUrlAction {
  @scala.inline
  def apply(): IOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenUrlAction]
  }
  @scala.inline
  implicit class IOpenUrlActionOps[Self <: IOpenUrlAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(null)
        ret
    }
    @scala.inline
    def withUrlTypeHint(value: UrlTypeHint): Self = {
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
    @scala.inline
    def withUrlTypeHintNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTypeHint")(null)
        ret
    }
  }
  
}

