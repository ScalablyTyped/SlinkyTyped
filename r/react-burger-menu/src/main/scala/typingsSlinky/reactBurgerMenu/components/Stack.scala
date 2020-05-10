package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stack {
  @JSImport("react-burger-menu", "stack")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[stack] = new SharedBuilder_Props_1590065578[stack](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Stack.type): SharedBuilder_Props_1590065578[stack] = new SharedBuilder_Props_1590065578[stack](js.Array(this.component, js.Dictionary.empty))()
}

