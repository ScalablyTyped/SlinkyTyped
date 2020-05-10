package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clickable menu item that is added to the card header menu.
  *
  *     var action = CardService.newAction();
  *     // Finish building the action...
  *
  *     var cardAction = CardService.newCardAction()
  *         .setText("Card action")
  *         .setOnClickAction(action);
  */
@js.native
trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction = js.native
  def setOnClickAction(action: Action): CardAction = js.native
  def setOnClickOpenLinkAction(action: Action): CardAction = js.native
  def setOpenLink(openLink: OpenLink): CardAction = js.native
  def setText(text: String): CardAction = js.native
}

object CardAction {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CardAction,
    setComposeAction: (Action, ComposedEmailType) => CardAction,
    setOnClickAction: Action => CardAction,
    setOnClickOpenLinkAction: Action => CardAction,
    setOpenLink: OpenLink => CardAction,
    setText: String => CardAction
  ): CardAction = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[CardAction]
  }
  @scala.inline
  implicit class CardActionOps[Self <: CardAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAuthorizationAction(value: AuthorizationAction => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthorizationAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComposeAction(value: (Action, ComposedEmailType) => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComposeAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetOnClickAction(value: Action => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickOpenLinkAction(value: Action => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => CardAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

