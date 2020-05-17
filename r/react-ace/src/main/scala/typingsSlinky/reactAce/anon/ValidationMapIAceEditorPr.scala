package typingsSlinky.reactAce.anon

import typingsSlinky.brace.mod.Annotation
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAce.aceEditorClassMod.AceEditorClass
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/ace.IAceEditorProps> */
@js.native
trait ValidationMapIAceEditorPr extends js.Object {
  var annotations: js.UndefOr[Validator[js.UndefOr[js.Array[Annotation]]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var commands: js.UndefOr[Validator[js.UndefOr[js.Array[ICommand]]]] = js.native
  var cursorStart: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var debounceChangePeriod: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var defaultValue: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var editorProps: js.UndefOr[Validator[js.UndefOr[IEditorProps]]] = js.native
  var enableBasicAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
  var enableLiveAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
  var enableSnippets: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var focus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var fontSize: js.UndefOr[Validator[js.UndefOr[Double | String]]] = js.native
  var height: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var highlightActiveLine: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var keyboardHandler: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var markers: js.UndefOr[Validator[js.UndefOr[js.Array[IMarker]]]] = js.native
  var maxLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var minLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var mode: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var navigateToFileEnd: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var onBeforeLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]]] = js.native
  var onBlur: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ]
  ] = js.native
  var onChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]
  ] = js.native
  var onCopy: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
  var onCursorChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
  ] = js.native
  var onFocus: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ]
  ] = js.native
  var onInput: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
  var onSelection: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
    ]
  ] = js.native
  var onSelectionChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
  ] = js.native
  var onValidate: js.UndefOr[
    Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]]]
  ] = js.native
  var placeholder: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var scrollMargin: js.UndefOr[Validator[js.UndefOr[js.Array[Double]]]] = js.native
  var setOptions: js.UndefOr[Validator[js.UndefOr[IAceOptions]]] = js.native
  var showGutter: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var showPrintMargin: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties]]] = js.native
  var tabSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var width: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var wrapEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
}

object ValidationMapIAceEditorPr {
  @scala.inline
  def apply(): ValidationMapIAceEditorPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIAceEditorPr]
  }
  @scala.inline
  implicit class ValidationMapIAceEditorPrOps[Self <: ValidationMapIAceEditorPr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Validator[js.UndefOr[js.Array[Annotation]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[String]]): Self = {
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
    def withCommands(value: Validator[js.UndefOr[js.Array[ICommand]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorStart(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceChangePeriod(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceChangePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceChangePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceChangePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorProps(value: Validator[js.UndefOr[IEditorProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorProps")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAutocompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBasicAutocompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBasicAutocompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLiveAutocompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLiveAutocompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLiveAutocompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSnippets(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnippets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSnippets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnippets")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Validator[js.UndefOr[Double | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightActiveLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveLine")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardHandler(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: Validator[js.UndefOr[js.Array[IMarker]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLines(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLines(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Validator[js.UndefOr[String]]): Self = {
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
    def withNavigateToFileEnd(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToFileEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateToFileEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateToFileEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeLoad(value: Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(
      value: Validator[
          js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCursorChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCursorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(
      value: Validator[
          js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(
      value: Validator[
          js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidate(value: Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: Validator[js.UndefOr[String]]): Self = {
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
    def withReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = {
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
    def withScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOptions(value: Validator[js.UndefOr[IAceOptions]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrintMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrintMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrintMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Validator[js.UndefOr[CSSProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapEnabled")(js.undefined)
        ret
    }
  }
  
}

