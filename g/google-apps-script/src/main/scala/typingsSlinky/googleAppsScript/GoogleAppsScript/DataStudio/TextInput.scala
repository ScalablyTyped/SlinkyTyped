package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text input information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newTextInput()
  *       .setId("info1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
@js.native
trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput = js.native
  def setHelpText(helpText: String): TextInput = js.native
  def setId(id: String): TextInput = js.native
  def setIsDynamic(isDynamic: Boolean): TextInput = js.native
  def setName(name: String): TextInput = js.native
  def setPlaceholder(placeholder: String): TextInput = js.native
}

object TextInput {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextInput,
    setHelpText: String => TextInput,
    setId: String => TextInput,
    setIsDynamic: Boolean => TextInput,
    setName: String => TextInput,
    setPlaceholder: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
    __obj.asInstanceOf[TextInput]
  }
  @scala.inline
  implicit class TextInputOps[Self <: TextInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAllowOverride(value: Boolean => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsDynamic(value: Boolean => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPlaceholder(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

