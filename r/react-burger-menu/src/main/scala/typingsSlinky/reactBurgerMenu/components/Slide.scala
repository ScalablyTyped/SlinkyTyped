package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  @JSImport("react-burger-menu", "slide")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[slide] = new SharedBuilder_Props_1590065578[slide](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Slide.type): SharedBuilder_Props_1590065578[slide] = new SharedBuilder_Props_1590065578[slide](js.Array(this.component, js.Dictionary.empty))()
}
