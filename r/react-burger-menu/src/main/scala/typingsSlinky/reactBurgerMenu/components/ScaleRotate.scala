package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.scaleRotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleRotate {
  @JSImport("react-burger-menu", "scaleRotate")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[scaleRotate] = new SharedBuilder_Props_1590065578[scaleRotate](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScaleRotate.type): SharedBuilder_Props_1590065578[scaleRotate] = new SharedBuilder_Props_1590065578[scaleRotate](js.Array(this.component, js.Dictionary.empty))()
}

