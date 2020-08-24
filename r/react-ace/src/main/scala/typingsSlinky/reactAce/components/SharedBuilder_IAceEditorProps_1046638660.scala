package typingsSlinky.reactAce.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.aceBuilds.mod.Ace.Annotation
import typingsSlinky.aceBuilds.mod.Ace.Editor
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAce.anon.TypeofAceBuilds
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_IAceEditorProps_1046638660[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def annotationsVarargs(value: Annotation*): this.type = set("annotations", js.Array(value :_*))
  @scala.inline
  def annotations(value: js.Array[Annotation]): this.type = set("annotations", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def commandsVarargs(value: ICommand*): this.type = set("commands", js.Array(value :_*))
  @scala.inline
  def commands(value: js.Array[ICommand]): this.type = set("commands", value.asInstanceOf[js.Any])
  @scala.inline
  def cursorStart(value: Double): this.type = set("cursorStart", value.asInstanceOf[js.Any])
  @scala.inline
  def debounceChangePeriod(value: Double): this.type = set("debounceChangePeriod", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def editorProps(value: IEditorProps): this.type = set("editorProps", value.asInstanceOf[js.Any])
  @scala.inline
  def enableBasicAutocompletionVarargs(value: String*): this.type = set("enableBasicAutocompletion", js.Array(value :_*))
  @scala.inline
  def enableBasicAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
  @scala.inline
  def enableLiveAutocompletionVarargs(value: String*): this.type = set("enableLiveAutocompletion", js.Array(value :_*))
  @scala.inline
  def enableLiveAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
  @scala.inline
  def enableSnippets(value: Boolean): this.type = set("enableSnippets", value.asInstanceOf[js.Any])
  @scala.inline
  def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
  @scala.inline
  def fontSize(value: Double | String): this.type = set("fontSize", value.asInstanceOf[js.Any])
  @scala.inline
  def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
  @scala.inline
  def highlightActiveLine(value: Boolean): this.type = set("highlightActiveLine", value.asInstanceOf[js.Any])
  @scala.inline
  def keyboardHandler(value: String): this.type = set("keyboardHandler", value.asInstanceOf[js.Any])
  @scala.inline
  def markersVarargs(value: IMarker*): this.type = set("markers", js.Array(value :_*))
  @scala.inline
  def markers(value: js.Array[IMarker]): this.type = set("markers", value.asInstanceOf[js.Any])
  @scala.inline
  def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
  @scala.inline
  def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
  @scala.inline
  def mode(value: String | js.Object): this.type = set("mode", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  @scala.inline
  def navigateToFileEnd(value: Boolean): this.type = set("navigateToFileEnd", value.asInstanceOf[js.Any])
  @scala.inline
  def onBeforeLoad(value: /* ace */ TypeofAceBuilds => Unit): this.type = set("onBeforeLoad", js.Any.fromFunction1(value))
  @scala.inline
  def onBlur(value: (/* event */ js.Any, /* editor */ js.UndefOr[Editor]) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
  @scala.inline
  def onChange(value: (/* value */ String, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  @scala.inline
  def onCopy(value: /* value */ String => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
  @scala.inline
  def onCursorChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onCursorChange", js.Any.fromFunction2(value))
  @scala.inline
  def onFocus(value: (/* event */ js.Any, /* editor */ js.UndefOr[Editor]) => Unit): this.type = set("onFocus", js.Any.fromFunction2(value))
  @scala.inline
  def onInput(value: /* event */ js.UndefOr[js.Any] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  @scala.inline
  def onLoad(value: /* editor */ Editor => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  @scala.inline
  def onPaste(value: /* value */ String => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
  @scala.inline
  def onScroll(value: /* editor */ IEditorProps => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  @scala.inline
  def onSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onSelection", js.Any.fromFunction2(value))
  @scala.inline
  def onSelectionChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onSelectionChange", js.Any.fromFunction2(value))
  @scala.inline
  def onValidate(value: /* annotations */ js.Array[Annotation] => Unit): this.type = set("onValidate", js.Any.fromFunction1(value))
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  @scala.inline
  def scrollMarginVarargs(value: Double*): this.type = set("scrollMargin", js.Array(value :_*))
  @scala.inline
  def scrollMargin(value: js.Array[Double]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
  @scala.inline
  def setOptions(value: IAceOptions): this.type = set("setOptions", value.asInstanceOf[js.Any])
  @scala.inline
  def showGutter(value: Boolean): this.type = set("showGutter", value.asInstanceOf[js.Any])
  @scala.inline
  def showPrintMargin(value: Boolean): this.type = set("showPrintMargin", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def tabSize(value: Double): this.type = set("tabSize", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapEnabled(value: Boolean): this.type = set("wrapEnabled", value.asInstanceOf[js.Any])
}

