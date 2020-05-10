package typingsSlinky.redboxReact.components

import typingsSlinky.redboxReact.mod.RedBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RedBoxError {
  @JSImport("redbox-react", "RedBoxError")
  @js.native
  object component extends js.Object
  
  def withProps(p: RedBoxProps): SharedBuilder_RedBoxProps_1909421642[typingsSlinky.redboxReact.mod.RedBoxError] = new SharedBuilder_RedBoxProps_1909421642[typingsSlinky.redboxReact.mod.RedBoxError](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(error: js.Error): SharedBuilder_RedBoxProps_1909421642[typingsSlinky.redboxReact.mod.RedBoxError] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new SharedBuilder_RedBoxProps_1909421642[typingsSlinky.redboxReact.mod.RedBoxError](js.Array(this.component, __props.asInstanceOf[RedBoxProps]))
  }
}

