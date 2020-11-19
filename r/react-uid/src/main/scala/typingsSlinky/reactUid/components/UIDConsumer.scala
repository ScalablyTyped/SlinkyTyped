package typingsSlinky.reactUid.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactUid.contextMod.UIDProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UIDConsumer {
  
  @JSImport("react-uid", "UIDConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: UIDProps): SharedBuilder_UIDProps670959062[js.Object] = new SharedBuilder_UIDProps670959062[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    children: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactElement
  ): SharedBuilder_UIDProps670959062[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new SharedBuilder_UIDProps670959062[js.Object](js.Array(this.component, __props.asInstanceOf[UIDProps]))
  }
}
