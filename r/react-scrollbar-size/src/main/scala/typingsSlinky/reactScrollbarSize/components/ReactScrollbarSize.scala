package typingsSlinky.reactScrollbarSize.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactScrollbarSize.mod.Measurement
import typingsSlinky.reactScrollbarSize.mod.ScrollbarSizeProps
import typingsSlinky.reactScrollbarSize.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrollbarSize {
  
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onChange(value: /* measurement */ Measurement => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: /* measurement */ Measurement => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactScrollbarSize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollbarSizeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
