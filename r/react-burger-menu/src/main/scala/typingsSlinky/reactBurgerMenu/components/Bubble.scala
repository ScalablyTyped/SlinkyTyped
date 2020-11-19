package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.bubble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bubble {
  
  @JSImport("react-burger-menu", "bubble")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[bubble] = new SharedBuilder_Props_1590065578[bubble](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Bubble.type): SharedBuilder_Props_1590065578[bubble] = new SharedBuilder_Props_1590065578[bubble](js.Array(this.component, js.Dictionary.empty))()
}
