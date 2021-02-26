package typingsSlinky.reactCustomScrollbars.components

import typingsSlinky.reactCustomScrollbars.mod.ScrollbarProps
import typingsSlinky.reactCustomScrollbars.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCustomScrollbars {
  
  @JSImport("react-custom-scrollbars", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactCustomScrollbars.type): SharedBuilder_ScrollbarProps1502755248[default] = new SharedBuilder_ScrollbarProps1502755248[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollbarProps): SharedBuilder_ScrollbarProps1502755248[default] = new SharedBuilder_ScrollbarProps1502755248[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
