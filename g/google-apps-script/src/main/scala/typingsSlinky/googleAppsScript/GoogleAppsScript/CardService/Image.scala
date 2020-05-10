package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that shows a single image.
  *
  *     var image = CardService.newImage().setAltText("A nice image").setImageUrl("https://image.png");
  */
@js.native
trait Image extends js.Object {
  def setAltText(altText: String): Image = js.native
  def setAuthorizationAction(action: AuthorizationAction): Image = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image = js.native
  def setImageUrl(url: String): Image = js.native
  def setOnClickAction(action: Action): Image = js.native
  def setOnClickOpenLinkAction(action: Action): Image = js.native
  def setOpenLink(openLink: OpenLink): Image = js.native
}

object Image {
  @scala.inline
  def apply(
    setAltText: String => Image,
    setAuthorizationAction: AuthorizationAction => Image,
    setComposeAction: (Action, ComposedEmailType) => Image,
    setImageUrl: String => Image,
    setOnClickAction: Action => Image,
    setOnClickOpenLinkAction: Action => Image,
    setOpenLink: OpenLink => Image
  ): Image = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setImageUrl = js.Any.fromFunction1(setImageUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAltText(value: String => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAltText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAuthorizationAction(value: AuthorizationAction => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthorizationAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComposeAction(value: (Action, ComposedEmailType) => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComposeAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickAction(value: Action => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickOpenLinkAction(value: Action => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

