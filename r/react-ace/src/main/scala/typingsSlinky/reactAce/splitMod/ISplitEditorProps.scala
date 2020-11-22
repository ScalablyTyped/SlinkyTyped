package typingsSlinky.reactAce.splitMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.IAnnotation
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplitEditorProps
  extends /* index */ StringDictionary[js.Any] {
  
  var annotations: js.UndefOr[js.Array[js.Array[IAnnotation]]] = js.native
  
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
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
  var theme: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Array[String]] = js.native
  
  var width: js.UndefOr[String] = js.native
  
  var wrapEnabled: js.UndefOr[Boolean] = js.native
}
object ISplitEditorProps {
  
  @scala.inline
  def apply(splits: Double): ISplitEditorProps = {
    val __obj = js.Dynamic.literal(splits = splits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitEditorProps]
  }
  
  @scala.inline
  implicit class ISplitEditorPropsOps[Self <: ISplitEditorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSplits(value: Double): Self = this.set("splits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsVarargs(value: js.Array[IAnnotation]*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[js.Array[IAnnotation]]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: ICommand*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[ICommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setCursorStart(value: Double): Self = this.set("cursorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStart: Self = this.set("cursorStart", js.undefined)
    
    @scala.inline
    def setDebounceChangePeriod(value: Double): Self = this.set("debounceChangePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceChangePeriod: Self = this.set("debounceChangePeriod", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setEditorProps(value: IEditorProps): Self = this.set("editorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorProps: Self = this.set("editorProps", js.undefined)
    
    @scala.inline
    def setEnableBasicAutocompletionVarargs(value: String*): Self = this.set("enableBasicAutocompletion", js.Array(value :_*))
    
    @scala.inline
    def setEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = this.set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBasicAutocompletion: Self = this.set("enableBasicAutocompletion", js.undefined)
    
    @scala.inline
    def setEnableLiveAutocompletionVarargs(value: String*): Self = this.set("enableLiveAutocompletion", js.Array(value :_*))
    
    @scala.inline
    def setEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = this.set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLiveAutocompletion: Self = this.set("enableLiveAutocompletion", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    
    @scala.inline
    def setKeyboardHandler(value: String): Self = this.set("keyboardHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandler: Self = this.set("keyboardHandler", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: js.Array[IMarker]*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[js.Array[IMarker]]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBeforeLoad(value: /* ace */ js.Any => Unit): Self = this.set("onBeforeLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeLoad: Self = this.set("onBeforeLoad", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* value */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnCopy(value: /* value */ String => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCursorChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("onCursorChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCursorChange: Self = this.set("onCursorChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* value */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: /* event */ js.UndefOr[js.Any] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* editor */ IEditorProps => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnPaste(value: /* value */ String => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* editor */ IEditorProps => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("onSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setScrollMarginVarargs(value: Double*): Self = this.set("scrollMargin", js.Array(value :_*))
    
    @scala.inline
    def setScrollMargin(value: js.Array[Double]): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    
    @scala.inline
    def setSetOptions(value: IAceOptions): Self = this.set("setOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapEnabled(value: Boolean): Self = this.set("wrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapEnabled: Self = this.set("wrapEnabled", js.undefined)
  }
}
