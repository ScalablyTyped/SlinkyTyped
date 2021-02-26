package typingsSlinky.reachRect.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRect.mod.RectProps
import typingsSlinky.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: /* args */ typingsSlinky.reachRect.anon.Rect => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def observe(value: Boolean): this.type = set("observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* rect */ DOMRect => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Rect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
