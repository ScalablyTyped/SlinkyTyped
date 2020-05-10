package typingsSlinky.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, js.UndefOr[String]]] = js.native
  var className: js.UndefOr[String] = js.native
  var customControls: js.UndefOr[js.Array[CustomControl]] = js.native
  var customStyleMap: js.UndefOr[StringDictionary[StringDictionary[js.Any]]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editorClassName: js.UndefOr[String] = js.native
  var editorStyle: js.UndefOr[js.Object] = js.native
  var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, Boolean]] = js.native
  var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[String]]] = js.native
  var onChange: js.UndefOr[ChangeHandler] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rootStyle: js.UndefOr[js.Object] = js.native
  var toolbarClassName: js.UndefOr[String] = js.native
   // Alias of readOnly
  var toolbarConfig: js.UndefOr[ToolbarConfig] = js.native
  var toolbarStyle: js.UndefOr[js.Object] = js.native
  var value: EditorValue = js.native
}

object Props {
  @scala.inline
  def apply(value: EditorValue): Props = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: EditorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockStyleFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomControls(value: js.Array[CustomControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControls")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyleMap(value: StringDictionary[StringDictionary[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyleMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleReturn(value: /* event */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyBindingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ EditorValue => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRootStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarConfig(value: ToolbarConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStyle")(js.undefined)
        ret
    }
  }
  
}

