package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reveal {
  
  @JSImport("react-burger-menu", "reveal")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[reveal] = new SharedBuilder_Props_1590065578[reveal](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Reveal.type): SharedBuilder_Props_1590065578[reveal] = new SharedBuilder_Props_1590065578[reveal](js.Array(this.component, js.Dictionary.empty))()
}
