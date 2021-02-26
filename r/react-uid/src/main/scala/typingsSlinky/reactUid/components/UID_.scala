package typingsSlinky.reactUid.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactUid.contextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UID_ {
  
  @scala.inline
  def apply(
    children: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactElement
  ): SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.mod.UID_] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.mod.UID_](js.Array(this.component, __props.asInstanceOf[UIDProps]))
  }
  
  @JSImport("react-uid", "UID")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: UIDProps): SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.mod.UID_] = new SharedBuilder_UIDProps670959062[typingsSlinky.reactUid.mod.UID_](js.Array(this.component, p.asInstanceOf[js.Any]))
}
