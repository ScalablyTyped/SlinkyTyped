package typingsSlinky.reactCustomScrollbars.components

import typingsSlinky.reactCustomScrollbars.mod.ScrollbarProps
import typingsSlinky.reactCustomScrollbars.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCustomScrollbars {
  
  @JSImport("react-custom-scrollbars", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollbarProps): SharedBuilder_ScrollbarProps1502755248[default] = new SharedBuilder_ScrollbarProps1502755248[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactCustomScrollbars.type): SharedBuilder_ScrollbarProps1502755248[default] = new SharedBuilder_ScrollbarProps1502755248[default](js.Array(this.component, js.Dictionary.empty))()
}
