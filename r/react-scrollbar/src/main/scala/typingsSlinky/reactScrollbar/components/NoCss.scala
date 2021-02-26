package typingsSlinky.reactScrollbar.components

import typingsSlinky.reactScrollbar.ScrollAreaProps
import typingsSlinky.reactScrollbar.noCssMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoCss {
  
  @JSImport("react-scrollbar/dist/no-css", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NoCss.type): SharedBuilder_ScrollAreaProps_622662951[^] = new SharedBuilder_ScrollAreaProps_622662951[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollAreaProps): SharedBuilder_ScrollAreaProps_622662951[^] = new SharedBuilder_ScrollAreaProps_622662951[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
