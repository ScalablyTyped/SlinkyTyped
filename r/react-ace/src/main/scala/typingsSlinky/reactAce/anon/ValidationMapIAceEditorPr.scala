package typingsSlinky.reactAce.anon

import typingsSlinky.aceBuilds.mod.Ace.Annotation
import typingsSlinky.aceBuilds.mod.Ace.Editor
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var mode: js.UndefOr[Validator[js.UndefOr[String | js.Object]]] = js.native
  
  var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var navigateToFileEnd: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var onBeforeLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]]]] = js.native
  
  var onBlur: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]
  ] = js.native
  
  var onChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]
  ] = js.native
  
  var onCopy: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
  
  var onCursorChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
  ] = js.native
  
  var onFocus: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]
  ] = js.native
  
  var onInput: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]] = js.native
  
  var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ Editor, Unit]]]] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotations(value: Validator[js.UndefOr[js.Array[Annotation]]]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCommands(value: Validator[js.UndefOr[js.Array[ICommand]]]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setCursorStart(value: Validator[js.UndefOr[Double]]): Self = this.set("cursorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStart: Self = this.set("cursorStart", js.undefined)
    
    @scala.inline
    def setDebounceChangePeriod(value: Validator[js.UndefOr[Double]]): Self = this.set("debounceChangePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceChangePeriod: Self = this.set("debounceChangePeriod", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[String]]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setEditorProps(value: Validator[js.UndefOr[IEditorProps]]): Self = this.set("editorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorProps: Self = this.set("editorProps", js.undefined)
    
    @scala.inline
    def setEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = this.set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBasicAutocompletion: Self = this.set("enableBasicAutocompletion", js.undefined)
    
    @scala.inline
    def setEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = this.set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLiveAutocompletion: Self = this.set("enableLiveAutocompletion", js.undefined)
    
    @scala.inline
    def setEnableSnippets(value: Validator[js.UndefOr[Boolean]]): Self = this.set("enableSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSnippets: Self = this.set("enableSnippets", js.undefined)
    
    @scala.inline
    def setFocus(value: Validator[js.UndefOr[Boolean]]): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFontSize(value: Validator[js.UndefOr[Double | String]]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Validator[js.UndefOr[String]]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    
    @scala.inline
    def setKeyboardHandler(value: Validator[js.UndefOr[String]]): Self = this.set("keyboardHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandler: Self = this.set("keyboardHandler", js.undefined)
    
    @scala.inline
    def setMarkers(value: Validator[js.UndefOr[js.Array[IMarker]]]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Validator[js.UndefOr[Double]]): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setMinLines(value: Validator[js.UndefOr[Double]]): Self = this.set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    
    @scala.inline
    def setMode(value: Validator[js.UndefOr[String | js.Object]]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: Validator[js.UndefOr[String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigateToFileEnd(value: Validator[js.UndefOr[Boolean]]): Self = this.set("navigateToFileEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateToFileEnd: Self = this.set("navigateToFileEnd", js.undefined)
    
    @scala.inline
    def setOnBeforeLoad(value: Validator[js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]]]): Self = this.set("onBeforeLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeLoad: Self = this.set("onBeforeLoad", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnCopy(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCursorChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = this.set("onCursorChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCursorChange: Self = this.set("onCursorChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]): Self = this.set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ Editor, Unit]]]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelection(
      value: Validator[
          js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
        ]
    ): Self = this.set("onSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = this.set("onSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnValidate(value: Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]]]): Self = this.set("onValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnValidate: Self = this.set("onValidate", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    
    @scala.inline
    def setSetOptions(value: Validator[js.UndefOr[IAceOptions]]): Self = this.set("setOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    
    @scala.inline
    def setShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    
    @scala.inline
    def setShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabSize(value: Validator[js.UndefOr[Double]]): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[String]]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setValue(value: Validator[js.UndefOr[String]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Validator[js.UndefOr[String]]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = this.set("wrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapEnabled: Self = this.set("wrapEnabled", js.undefined)
  }
}
