package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.fallDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FallDown {
  @JSImport("react-burger-menu", "fallDown")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[fallDown] = new SharedBuilder_Props_1590065578[fallDown](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FallDown.type): SharedBuilder_Props_1590065578[fallDown] = new SharedBuilder_Props_1590065578[fallDown](js.Array(this.component, js.Dictionary.empty))()
}

