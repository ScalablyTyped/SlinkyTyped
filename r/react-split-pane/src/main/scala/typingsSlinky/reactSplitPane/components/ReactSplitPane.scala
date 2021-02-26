package typingsSlinky.reactSplitPane.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSplitPane.mod.Size
import typingsSlinky.reactSplitPane.mod.SplitPaneProps
import typingsSlinky.reactSplitPane.mod.default
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.first
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.horizontal
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.second
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSplitPane {
  
  @JSImport("react-split-pane", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def allowResize(value: Boolean): this.type = set("allowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSize(value: Size): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxSize(value: Size): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minSize(value: Size): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* newSize */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragFinished(value: /* newSize */ Double => Unit): this.type = set("onDragFinished", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStarted(value: () => Unit): this.type = set("onDragStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def onResizerClick(value: /* event */ MouseEvent => Unit): this.type = set("onResizerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResizerDoubleClick(value: /* event */ MouseEvent => Unit): this.type = set("onResizerDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def pane1Style(value: CSSProperties): this.type = set("pane1Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pane2Style(value: CSSProperties): this.type = set("pane2Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paneStyle(value: CSSProperties): this.type = set("paneStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primary(value: first | second): this.type = set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizerClassName(value: String): this.type = set("resizerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizerStyle(value: CSSProperties): this.type = set("resizerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def split(value: vertical | horizontal): this.type = set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSplitPane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SplitPaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
