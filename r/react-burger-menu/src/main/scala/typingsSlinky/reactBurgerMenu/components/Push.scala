package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Push {
  
  @JSImport("react-burger-menu", "push")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[push] = new SharedBuilder_Props_1590065578[push](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Push.type): SharedBuilder_Props_1590065578[push] = new SharedBuilder_Props_1590065578[push](js.Array(this.component, js.Dictionary.empty))()
}
