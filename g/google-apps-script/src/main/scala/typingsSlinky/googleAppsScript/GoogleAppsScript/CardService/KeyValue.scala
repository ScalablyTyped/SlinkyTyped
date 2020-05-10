package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that displays one or more "keys" around a text "value". The possible keys include an
  * icon, a label above and a label below. Setting the text content and one of the keys is required
  * using setContent(text) and one of setIcon(icon), setIconUrl(url), setTopLabel(text),
  * or setBottomLabel(text).
  *
  *     var imageKeyValue = CardService.newKeyValue()
  *         .setIconUrl("https://icon.png")
  *         .setContent("KeyValue widget with an image on the left and text on the right");
  *
  *     var textKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Text key")
  *         .setContent("KeyValue widget with text key on top and cotent below");
  *
  *     var multilineKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Top label - single line)")
  *         .setContent("Content can be multiple lines")
  *         .setMultiline(true)
  *         .setBottomLabel("Bottom label - single line");
  */
@js.native
trait KeyValue extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): KeyValue = js.native
  def setBottomLabel(text: String): KeyValue = js.native
  def setButton(button: Button): KeyValue = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue = js.native
  def setContent(text: String): KeyValue = js.native
  def setIcon(icon: Icon): KeyValue = js.native
  def setIconAltText(altText: String): KeyValue = js.native
  def setIconUrl(url: String): KeyValue = js.native
  def setMultiline(multiline: Boolean): KeyValue = js.native
  def setOnClickAction(action: Action): KeyValue = js.native
  def setOnClickOpenLinkAction(action: Action): KeyValue = js.native
  def setOpenLink(openLink: OpenLink): KeyValue = js.native
  def setSwitch(switchToSet: Switch): KeyValue = js.native
  def setTopLabel(text: String): KeyValue = js.native
}

object KeyValue {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => KeyValue,
    setBottomLabel: String => KeyValue,
    setButton: Button => KeyValue,
    setComposeAction: (Action, ComposedEmailType) => KeyValue,
    setContent: String => KeyValue,
    setIcon: Icon => KeyValue,
    setIconAltText: String => KeyValue,
    setIconUrl: String => KeyValue,
    setMultiline: Boolean => KeyValue,
    setOnClickAction: Action => KeyValue,
    setOnClickOpenLinkAction: Action => KeyValue,
    setOpenLink: OpenLink => KeyValue,
    setSwitch: Switch => KeyValue,
    setTopLabel: String => KeyValue
  ): KeyValue = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBottomLabel = js.Any.fromFunction1(setBottomLabel), setButton = js.Any.fromFunction1(setButton), setComposeAction = js.Any.fromFunction2(setComposeAction), setContent = js.Any.fromFunction1(setContent), setIcon = js.Any.fromFunction1(setIcon), setIconAltText = js.Any.fromFunction1(setIconAltText), setIconUrl = js.Any.fromFunction1(setIconUrl), setMultiline = js.Any.fromFunction1(setMultiline), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setSwitch = js.Any.fromFunction1(setSwitch), setTopLabel = js.Any.fromFunction1(setTopLabel))
    __obj.asInstanceOf[KeyValue]
  }
  @scala.inline
  implicit class KeyValueOps[Self <: KeyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAuthorizationAction(value: AuthorizationAction => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthorizationAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBottomLabel(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottomLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetButton(value: Button => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComposeAction(value: (Action, ComposedEmailType) => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComposeAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: Icon => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIconAltText(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconAltText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIconUrl(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMultiline(value: Boolean => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultiline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickAction(value: Action => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnClickOpenLinkAction(value: Action => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSwitch(value: Switch => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSwitch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTopLabel(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTopLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

