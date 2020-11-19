package typingsSlinky.reactCustomScrollbars.components

import typingsSlinky.reactCustomScrollbars.mod.ScrollbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scrollbars {
  
  @JSImport("react-custom-scrollbars", "Scrollbars")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollbarProps): SharedBuilder_ScrollbarProps1502755248[typingsSlinky.reactCustomScrollbars.mod.Scrollbars] = new SharedBuilder_ScrollbarProps1502755248[typingsSlinky.reactCustomScrollbars.mod.Scrollbars](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Scrollbars.type): SharedBuilder_ScrollbarProps1502755248[typingsSlinky.reactCustomScrollbars.mod.Scrollbars] = new SharedBuilder_ScrollbarProps1502755248[typingsSlinky.reactCustomScrollbars.mod.Scrollbars](js.Array(this.component, js.Dictionary.empty))()
}
