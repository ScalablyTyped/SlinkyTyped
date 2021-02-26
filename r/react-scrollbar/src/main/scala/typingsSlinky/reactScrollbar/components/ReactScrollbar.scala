package typingsSlinky.reactScrollbar.components

import typingsSlinky.reactScrollbar.ScrollAreaProps
import typingsSlinky.reactScrollbar.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrollbar {
  
  @JSImport("react-scrollbar", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactScrollbar.type): SharedBuilder_ScrollAreaProps_622662951[^] = new SharedBuilder_ScrollAreaProps_622662951[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollAreaProps): SharedBuilder_ScrollAreaProps_622662951[^] = new SharedBuilder_ScrollAreaProps_622662951[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
