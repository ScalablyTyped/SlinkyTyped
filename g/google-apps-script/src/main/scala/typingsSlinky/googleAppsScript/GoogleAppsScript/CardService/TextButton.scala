package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextButton with a text label. You can set the background color and disable the button when
  * needed.
  *
  *     var textButton = CardService.newTextButton()
  *         .setText("Open Link")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"));
  */
@js.native
trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton = js.native
  def setBackgroundColor(backgroundColor: String): TextButton = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton = js.native
  def setDisabled(disabled: Boolean): TextButton = js.native
  def setOnClickAction(action: Action): TextButton = js.native
  def setOnClickOpenLinkAction(action: Action): TextButton = js.native
  def setOpenLink(openLink: OpenLink): TextButton = js.native
  def setText(text: String): TextButton = js.native
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton = js.native
}

object TextButton {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => TextButton,
    setBackgroundColor: String => TextButton,
    setComposeAction: (Action, ComposedEmailType) => TextButton,
    setDisabled: Boolean => TextButton,
    setOnClickAction: Action => TextButton,
    setOnClickOpenLinkAction: Action => TextButton,
    setOpenLink: OpenLink => TextButton,
    setText: String => TextButton,
    setTextButtonStyle: TextButtonStyle => TextButton
  ): TextButton = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setComposeAction = js.Any.fromFunction2(setComposeAction), setDisabled = js.Any.fromFunction1(setDisabled), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText), setTextButtonStyle = js.Any.fromFunction1(setTextButtonStyle))
    __obj.asInstanceOf[TextButton]
  }
  @scala.inline
  implicit class TextButtonOps[Self <: TextButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAuthorizationAction(value: AuthorizationAction => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthorizationAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackgroundColor(value: String => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComposeAction(value: (Action, ComposedEmailType) => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComposeAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDisabled(value: Boolean => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickAction(value: Action => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickOpenLinkAction(value: Action => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTextButtonStyle(value: TextButtonStyle => TextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextButtonStyle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

