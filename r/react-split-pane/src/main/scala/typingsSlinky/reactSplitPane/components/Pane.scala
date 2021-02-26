package typingsSlinky.reactSplitPane.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSplitPane.mod.PaneProps
import typingsSlinky.reactSplitPane.mod.Size
import typingsSlinky.reactSplitPane.mod.Split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pane {
  
  @JSImport("react-split-pane", "Pane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSplitPane.mod.Pane] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eleRef(value: /* el */ HTMLDivElement => Unit): this.type = set("eleRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def split(value: Split): this.type = set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
