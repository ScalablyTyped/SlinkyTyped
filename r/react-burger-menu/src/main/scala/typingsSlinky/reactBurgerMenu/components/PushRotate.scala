package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.pushRotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PushRotate {
  
  @JSImport("react-burger-menu", "pushRotate")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[pushRotate] = new SharedBuilder_Props_1590065578[pushRotate](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PushRotate.type): SharedBuilder_Props_1590065578[pushRotate] = new SharedBuilder_Props_1590065578[pushRotate](js.Array(this.component, js.Dictionary.empty))()
}
