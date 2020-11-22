package typingsSlinky.ot.mod.Client

import typingsSlinky.ot.mod.Selection
import typingsSlinky.ot.mod.TextOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sync[C, S, A] extends js.Object {
  
  def applyClient(client: typingsSlinky.ot.mod.Client, operation: TextOperation): C = js.native
  
  def applyServer(client: typingsSlinky.ot.mod.Client, operation: TextOperation): S = js.native
  
  def serverAck(): A = js.native
  
  def transformSelection(selection: Selection): Selection = js.native
}
object Sync {
  
  @scala.inline
  def apply[C, S, A](
    applyClient: (typingsSlinky.ot.mod.Client, TextOperation) => C,
    applyServer: (typingsSlinky.ot.mod.Client, TextOperation) => S,
    serverAck: () => A,
    transformSelection: Selection => Selection
  ): Sync[C, S, A] = {
    val __obj = js.Dynamic.literal(applyClient = js.Any.fromFunction2(applyClient), applyServer = js.Any.fromFunction2(applyServer), serverAck = js.Any.fromFunction0(serverAck), transformSelection = js.Any.fromFunction1(transformSelection))
    __obj.asInstanceOf[Sync[C, S, A]]
  }
  
  @scala.inline
  implicit class SyncOps[Self <: Sync[_, _, _], C, S, A] (val x: Self with (Sync[C, S, A])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyClient(value: (typingsSlinky.ot.mod.Client, TextOperation) => C): Self = this.set("applyClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplyServer(value: (typingsSlinky.ot.mod.Client, TextOperation) => S): Self = this.set("applyServer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setServerAck(value: () => A): Self = this.set("serverAck", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransformSelection(value: Selection => Selection): Self = this.set("transformSelection", js.Any.fromFunction1(value))
  }
}
