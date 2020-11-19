package typingsSlinky.reResizable.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.reResizable.resizerMod.Props
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resizer {
  
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reResizable.resizerMod.Resizer] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def replaceStyles(value: CSSProperties): this.type = set("replaceStyles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
