package typingsSlinky.mobxReactLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/utils/reactBatchedUpdates.native", JSImport.Namespace)
@js.native
object reactBatchedUpdatesNativeMod extends js.Object {
  
  @JSName("unstable_batchedUpdates")
  def unstableBatchedUpdates(callback: js.Function0[_]): Unit = js.native
  @JSName("unstable_batchedUpdates")
  def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  @JSName("unstable_batchedUpdates")
  def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
}
