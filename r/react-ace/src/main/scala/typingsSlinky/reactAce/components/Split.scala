package typingsSlinky.reactAce.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.brace.mod.Annotation
import typingsSlinky.reactAce.splitMod.ISplitEditorProps
import typingsSlinky.reactAce.splitMod.default
import typingsSlinky.reactAce.typesMod.IAceOptions
import typingsSlinky.reactAce.typesMod.ICommand
import typingsSlinky.reactAce.typesMod.IEditorProps
import typingsSlinky.reactAce.typesMod.IMarker
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Split {
  @JSImport("react-ace/lib/split", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def annotations(value: js.Array[js.Array[Annotation]]): this.type = set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def commands(value: js.Array[ICommand]): this.type = set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorStart(value: Double): this.type = set("cursorStart", value.asInstanceOf[js.Any])
    @scala.inline
    def debounceChangePeriod(value: Double): this.type = set("debounceChangePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def editorProps(value: IEditorProps): this.type = set("editorProps", value.asInstanceOf[js.Any])
    @scala.inline
    def enableBasicAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def enableLiveAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
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
    def markers(value: js.Array[js.Array[IMarker]]): this.type = set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBeforeLoad(value: /* ace */ js.Any => Unit): this.type = set("onBeforeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: /* value */ Event_ => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onCopy(value: /* value */ String => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCursorChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onCursorChange", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: /* value */ Event_ => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onInput(value: /* event */ js.UndefOr[js.Any] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: /* editor */ IEditorProps => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: /* value */ String => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: /* editor */ IEditorProps => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onSelection", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectionChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onSelectionChange", js.Any.fromFunction2(value))
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollMargin(value: js.Array[Double]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: IAceOptions): this.type = set("setOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def showGutter(value: Boolean): this.type = set("showGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def showPrintMargin(value: Boolean): this.type = set("showPrintMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def tabSize(value: Double): this.type = set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapEnabled(value: Boolean): this.type = set("wrapEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISplitEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(splits: Double, style: js.Any): Builder = {
    val __props = js.Dynamic.literal(splits = splits.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISplitEditorProps]))
  }
}

