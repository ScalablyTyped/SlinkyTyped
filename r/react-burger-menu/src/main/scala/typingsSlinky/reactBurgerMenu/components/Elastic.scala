package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.elastic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elastic {
  
  @JSImport("react-burger-menu", "elastic")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[elastic] = new SharedBuilder_Props_1590065578[elastic](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Elastic.type): SharedBuilder_Props_1590065578[elastic] = new SharedBuilder_Props_1590065578[elastic](js.Array(this.component, js.Dictionary.empty))()
}
