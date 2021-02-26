package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.topBarMod.TopBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TopBar {
  
  @JSImport("react-foundation", "TopBar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TopBar.type): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TopBarProps): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, p.asInstanceOf[js.Any]))
}
