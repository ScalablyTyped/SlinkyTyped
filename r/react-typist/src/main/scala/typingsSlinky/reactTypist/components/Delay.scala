package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.Typist.DelayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Delay {
  
  @JSImport("react-typist", "Typist.Delay")
  @js.native
  object component extends js.Object
  
  def withProps(p: DelayProps): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay] = new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(ms: Double): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay] = {
    val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay](js.Array(this.component, __props.asInstanceOf[DelayProps]))
  }
}
