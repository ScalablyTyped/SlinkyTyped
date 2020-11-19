package typingsSlinky.pullStream

import typingsSlinky.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/throughs/through", JSImport.Namespace)
@js.native
object throughMod extends js.Object {
  
  /**
    * Returns a pass through stream that doesn't change the value.
    */
  def apply[InOut](): Through_[InOut, InOut] = js.native
  def apply[InOut](op: js.UndefOr[scala.Nothing], onEnd: js.Function1[/* err */ js.Error | Null, _]): Through_[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ js.Error | Null, _]): Through_[InOut, InOut] = js.native
}
