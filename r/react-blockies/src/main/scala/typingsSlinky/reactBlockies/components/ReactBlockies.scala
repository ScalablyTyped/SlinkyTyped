package typingsSlinky.reactBlockies.components

import typingsSlinky.reactBlockies.mod.IdenticonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBlockies {
  
  @JSImport("react-blockies", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IdenticonProps): SharedBuilder_IdenticonProps_1051449635 = new SharedBuilder_IdenticonProps_1051449635(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(seed: String): SharedBuilder_IdenticonProps_1051449635 = {
    val __props = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    new SharedBuilder_IdenticonProps_1051449635(js.Array(this.component, __props.asInstanceOf[IdenticonProps]))
  }
}
