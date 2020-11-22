package typingsSlinky.fluentuiReactComponentRef

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-component-ref/dist/es/handleRef", JSImport.Namespace)
@js.native
object handleRefMod extends js.Object {
  
  def default[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref - An ref object or function
    * @param node - A node that should be passed by ref
    */
  def default[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  def default[N](ref: Null, node: N): Unit = js.native
  def default[N](ref: ReactRef[N], node: N): Unit = js.native
}
