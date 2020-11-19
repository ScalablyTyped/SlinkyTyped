package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.topBarMod.TopBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TopBarRight {
  
  @JSImport("react-foundation", "TopBarRight")
  @js.native
  object component extends js.Object
  
  def withProps(p: TopBarProps): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TopBarRight.type): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, js.Dictionary.empty))()
}
