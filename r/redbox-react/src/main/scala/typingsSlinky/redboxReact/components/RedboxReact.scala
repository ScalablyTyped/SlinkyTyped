package typingsSlinky.redboxReact.components

import typingsSlinky.redboxReact.mod.RedBoxProps
import typingsSlinky.redboxReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RedboxReact {
  
  @scala.inline
  def apply(error: js.Error): SharedBuilder_RedBoxProps_1909421642[default] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new SharedBuilder_RedBoxProps_1909421642[default](js.Array(this.component, __props.asInstanceOf[RedBoxProps]))
  }
  
  @JSImport("redbox-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RedBoxProps): SharedBuilder_RedBoxProps_1909421642[default] = new SharedBuilder_RedBoxProps_1909421642[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
