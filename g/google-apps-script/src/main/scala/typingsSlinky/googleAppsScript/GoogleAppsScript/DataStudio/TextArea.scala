package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text area information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  * Usage:
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var textArea1 = config.newTextArea()
  *       .setId("textArea1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
@js.native
trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextArea = js.native
  def setHelpText(helpText: String): TextArea = js.native
  def setId(id: String): TextArea = js.native
  def setIsDynamic(isDynamic: Boolean): TextArea = js.native
  def setName(name: String): TextArea = js.native
  def setPlaceholder(placeholder: String): TextArea = js.native
}

object TextArea {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextArea,
    setHelpText: String => TextArea,
    setId: String => TextArea,
    setIsDynamic: Boolean => TextArea,
    setName: String => TextArea,
    setPlaceholder: String => TextArea
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
    __obj.asInstanceOf[TextArea]
  }
  @scala.inline
  implicit class TextAreaOps[Self <: TextArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAllowOverride(value: Boolean => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsDynamic(value: Boolean => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPlaceholder(value: String => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

