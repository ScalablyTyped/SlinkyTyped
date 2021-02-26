package typingsSlinky.reactAce.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAce.diffMod.IDiffEditorProps
import typingsSlinky.reactAce.mod.diff
import typingsSlinky.reactAce.typesMod.IEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diff {
  
  @JSImport("react-ace", "diff")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, diff] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorStart(value: Double): this.type = set("cursorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editorProps(value: js.Object): this.type = set("editorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableBasicAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableBasicAutocompletionVarargs(value: String*): this.type = set("enableBasicAutocompletion", js.Array(value :_*))
    
    @scala.inline
    def enableLiveAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableLiveAutocompletionVarargs(value: String*): this.type = set("enableLiveAutocompletion", js.Array(value :_*))
    
    @scala.inline
    def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightActiveLine(value: Boolean): this.type = set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLoad(value: /* editor */ IEditorProps => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: /* value */ String => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* editor */ IEditorProps => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMargin(value: js.Array[Double]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginVarargs(value: Double*): this.type = set("scrollMargin", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Object): this.type = set("setOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showGutter(value: Boolean): this.type = set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPrintMargin(value: Boolean): this.type = set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def splits(value: Double): this.type = set("splits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabSize(value: Double): this.type = set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapEnabled(value: Boolean): this.type = set("wrapEnabled", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Diff.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDiffEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
