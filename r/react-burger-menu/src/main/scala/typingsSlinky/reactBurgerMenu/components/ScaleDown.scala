package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.scaleDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleDown {
  @JSImport("react-burger-menu", "scaleDown")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[scaleDown] = new SharedBuilder_Props_1590065578[scaleDown](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScaleDown.type): SharedBuilder_Props_1590065578[scaleDown] = new SharedBuilder_Props_1590065578[scaleDown](js.Array(this.component, js.Dictionary.empty))()
}

