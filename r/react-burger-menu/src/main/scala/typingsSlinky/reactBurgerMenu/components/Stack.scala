package typingsSlinky.reactBurgerMenu.components

import typingsSlinky.reactBurgerMenu.mod.Props
import typingsSlinky.reactBurgerMenu.mod.stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stack {
  
  @JSImport("react-burger-menu", "stack")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Stack.type): SharedBuilder_Props_1590065578[stack] = new SharedBuilder_Props_1590065578[stack](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1590065578[stack] = new SharedBuilder_Props_1590065578[stack](js.Array(this.component, p.asInstanceOf[js.Any]))
}
