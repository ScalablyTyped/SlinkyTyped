package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonEventModel
import typingsSlinky.devextreme.devextremeStrings.html
import typingsSlinky.devextreme.devextremeStrings.markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorOptions extends EditorOptions[dxHtmlEditor] {
  /** Allows you to customize Quill and 3rd-party modules. */
  var customizeModules: js.UndefOr[js.Function1[/* config */ js.Any, _]] = js.native
  /** Configures media resizing. */
  var mediaResizing: js.UndefOr[dxHtmlEditorMediaResizing] = js.native
  /** Configures mentions. */
  var mentions: js.UndefOr[js.Array[dxHtmlEditorMention]] = js.native
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.native
  /** A function that is executed when the widget gets focus. */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ AnonEventModel, _]] = js.native
  /** A function that is executed when the widget loses focus. */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ AnonEventModel, _]] = js.native
  /** Specifies the text displayed when the input field is empty. */
  var placeholder: js.UndefOr[String] = js.native
  /** Configures the widget's toolbar. */
  var toolbar: js.UndefOr[dxHtmlEditorToolbar] = js.native
  /** Specifies in which markup language the value is stored. */
  var valueType: js.UndefOr[html | markdown] = js.native
  /** Configures variables, which are placeholders to be replaced with actual values when processing text. */
  var variables: js.UndefOr[dxHtmlEditorVariables] = js.native
}

object dxHtmlEditorOptions {
  @scala.inline
  def apply(): dxHtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorOptions]
  }
  @scala.inline
  implicit class dxHtmlEditorOptionsOps[Self <: dxHtmlEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeModules(value: /* config */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeModules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaResizing(value: dxHtmlEditorMediaResizing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withMentions(value: js.Array[dxHtmlEditorMention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusIn(value: /* e */ AnonEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusOut(value: /* e */ AnonEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: dxHtmlEditorToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: html | markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: dxHtmlEditorVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

