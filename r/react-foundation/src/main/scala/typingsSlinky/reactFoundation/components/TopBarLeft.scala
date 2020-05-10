package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.topBarMod.TopBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TopBarLeft {
  @JSImport("react-foundation", "TopBarLeft")
  @js.native
  object component extends js.Object
  
  def withProps(p: TopBarProps): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TopBarLeft.type): SharedBuilder_TopBarProps1287358894 = new SharedBuilder_TopBarProps1287358894(js.Array(this.component, js.Dictionary.empty))()
}

