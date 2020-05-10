package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A input field widget that accepts text input.
  *
  *     var textInput = CardService.newTextInput()
  *         .setFieldName("text_input_form_input_key")
  *         .setTitle("Text input title")
  *         .setHint("Text input hint");
  */
@js.native
trait TextInput extends js.Object {
  def setFieldName(fieldName: String): TextInput = js.native
  def setHint(hint: String): TextInput = js.native
  def setMultiline(multiline: Boolean): TextInput = js.native
  def setOnChangeAction(action: Action): TextInput = js.native
  def setSuggestions(suggestions: Suggestions): TextInput = js.native
  def setSuggestionsAction(suggestionsAction: Action): TextInput = js.native
  def setTitle(title: String): TextInput = js.native
  def setValue(value: String): TextInput = js.native
}

object TextInput {
  @scala.inline
  def apply(
    setFieldName: String => TextInput,
    setHint: String => TextInput,
    setMultiline: Boolean => TextInput,
    setOnChangeAction: Action => TextInput,
    setSuggestions: Suggestions => TextInput,
    setSuggestionsAction: Action => TextInput,
    setTitle: String => TextInput,
    setValue: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setHint = js.Any.fromFunction1(setHint), setMultiline = js.Any.fromFunction1(setMultiline), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSuggestions = js.Any.fromFunction1(setSuggestions), setSuggestionsAction = js.Any.fromFunction1(setSuggestionsAction), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[TextInput]
  }
  @scala.inline
  implicit class TextInputOps[Self <: TextInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetFieldName(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHint(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMultiline(value: Boolean => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultiline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnChangeAction(value: Action => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnChangeAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuggestions(value: Suggestions => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuggestionsAction(value: Action => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuggestionsAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

