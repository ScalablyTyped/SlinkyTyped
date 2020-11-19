package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBurgerMenu {
  
  @JSImport("react-burger-menu", "ReactBurgerMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[typingsSlinky.reactBurgerMenu.mod.ReactBurgerMenu] = new SharedBuilder_Props_1590065578[typingsSlinky.reactBurgerMenu.mod.ReactBurgerMenu](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactBurgerMenu.type): SharedBuilder_Props_1590065578[typingsSlinky.reactBurgerMenu.mod.ReactBurgerMenu] = new SharedBuilder_Props_1590065578[typingsSlinky.reactBurgerMenu.mod.ReactBurgerMenu](js.Array(this.component, js.Dictionary.empty))()
}
