package typingsSlinky.reactAce.splitMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.brace.mod.Annotation
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplitEditorProps
  extends /* index */ StringDictionary[js.Any] {
  var annotations: js.UndefOr[js.Array[js.Array[Annotation]]] = js.native
  var className: js.UndefOr[String] = js.native
  var commands: js.UndefOr[js.Array[ICommand]] = js.native
  var cursorStart: js.UndefOr[Double] = js.native
  var debounceChangePeriod: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[js.Array[String]] = js.native
  var editorProps: js.UndefOr[IEditorProps] = js.native
  var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
  var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
  var focus: js.UndefOr[Boolean] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[String] = js.native
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  var keyboardHandler: js.UndefOr[String] = js.native
  var markers: js.UndefOr[js.Array[js.Array[IMarker]]] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var minLines: js.UndefOr[Double] = js.native
  /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ js.Any, Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[js.Any], Unit]] = js.native
  var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.native
  var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
  var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
  var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.native
  var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
  var orientation: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var scrollMargin: js.UndefOr[js.Array[Double]] = js.native
  var setOptions: js.UndefOr[IAceOptions] = js.native
  var showGutter: js.UndefOr[Boolean] = js.native
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  var splits: Double = js.native
  var style: js.Any = js.native
  var tabSize: js.UndefOr[Double] = js.native
  /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
  var theme: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String]] = js.native
  var width: js.UndefOr[String] = js.native
  var wrapEnabled: js.UndefOr[Boolean] = js.native
}

object ISplitEditorProps {
  @scala.inline
  def apply(splits: Double, style: js.Any): ISplitEditorProps = {
    val __obj = js.Dynamic.literal(splits = splits.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitEditorProps]
  }
  @scala.inline
  implicit class ISplitEditorPropsOps[Self <: ISplitEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[js.Array[Annotation]]): Self = {
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
    def withCommands(value: js.Array[ICommand]): Self = {
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
    def withCursorStart(value: Double): Self = {
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
    def withDebounceChangePeriod(value: Double): Self = {
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
    def withDefaultValue(value: js.Array[String]): Self = {
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
    def withEditorProps(value: IEditorProps): Self = {
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
    def withEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = {
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
    def withEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = {
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
    def withFocus(value: Boolean): Self = {
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
    def withFontSize(value: Double | String): Self = {
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
    def withHeight(value: String): Self = {
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
    def withHighlightActiveLine(value: Boolean): Self = {
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
    def withKeyboardHandler(value: String): Self = {
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
    def withMarkers(value: js.Array[js.Array[IMarker]]): Self = {
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
    def withMaxLines(value: Double): Self = {
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
    def withMinLines(value: Double): Self = {
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
    def withMode(value: String): Self = {
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
    def withOnBeforeLoad(value: /* ace */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* value */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCursorChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCursorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* value */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: /* event */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* editor */ IEditorProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* editor */ IEditorProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
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
    def withScrollMargin(value: js.Array[Double]): Self = {
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
    def withSetOptions(value: IAceOptions): Self = {
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
    def withShowGutter(value: Boolean): Self = {
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
    def withShowPrintMargin(value: Boolean): Self = {
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
    def withTabSize(value: Double): Self = {
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
    def withTheme(value: String): Self = {
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
    def withValue(value: js.Array[String]): Self = {
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
    def withWidth(value: String): Self = {
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
    def withWrapEnabled(value: Boolean): Self = {
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

