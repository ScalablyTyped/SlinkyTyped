package typingsSlinky.monacoEditor.mod.worker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkerContext[H] extends js.Object {
  /**
    * A proxy to the main thread host object.
    */
  var host: H = js.native
  /**
    * Get all available mirror models in this worker.
    */
  def getMirrorModels(): js.Array[IMirrorModel] = js.native
}

object IWorkerContext {
  @scala.inline
  def apply[H](getMirrorModels: () => js.Array[IMirrorModel], host: H): IWorkerContext[H] = {
    val __obj = js.Dynamic.literal(getMirrorModels = js.Any.fromFunction0(getMirrorModels), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkerContext[H]]
  }
  @scala.inline
  implicit class IWorkerContextOps[Self[h] <: IWorkerContext[h], H] (val x: Self[H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[H] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[H] with Other]
    @scala.inline
    def withGetMirrorModels(value: () => js.Array[IMirrorModel]): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMirrorModels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHost(value: H): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

