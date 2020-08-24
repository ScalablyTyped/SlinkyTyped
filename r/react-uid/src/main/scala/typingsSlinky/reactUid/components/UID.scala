package typingsSlinky.reactUid.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactUid.contextMod.UIDProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UID {
  @JSImport("react-uid/dist/es5/UIDComponent", "UID")
  @js.native
  object component extends js.Object
  
  def withProps(p: UIDProps): SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.uidcomponentMod.UID] = new SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.uidcomponentMod.UID](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    children: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactElement
  ): SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.uidcomponentMod.UID] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.uidcomponentMod.UID](js.Array(this.component, __props.asInstanceOf[UIDProps]))
  }
}

