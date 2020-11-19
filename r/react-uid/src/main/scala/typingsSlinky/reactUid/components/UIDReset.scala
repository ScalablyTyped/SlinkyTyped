package typingsSlinky.reactUid.components

import typingsSlinky.reactUid.controlMod.WithPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UIDReset {
  
  @JSImport("react-uid", "UIDReset")
  @js.native
  object component extends js.Object
  
  def withProps(p: WithPrefix): SharedBuilder_WithPrefix_1053596693 = new SharedBuilder_WithPrefix_1053596693(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: UIDReset.type): SharedBuilder_WithPrefix_1053596693 = new SharedBuilder_WithPrefix_1053596693(js.Array(this.component, js.Dictionary.empty))()
}
