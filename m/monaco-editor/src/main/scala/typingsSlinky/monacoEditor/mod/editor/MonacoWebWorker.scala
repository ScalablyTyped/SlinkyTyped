package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoWebWorker[T] extends js.Object {
  /**
    * Terminate the web worker, thus invalidating the returned proxy.
    */
  def dispose(): Unit = js.native
  /**
    * Get a proxy to the arbitrary loaded code.
    */
  def getProxy(): js.Promise[T] = js.native
  /**
    * Synchronize (send) the models at `resources` to the web worker,
    * making them available in the monaco.worker.getMirrorModels().
    */
  def withSyncedResources(resources: js.Array[Uri]): js.Promise[T] = js.native
}

object MonacoWebWorker {
  @scala.inline
  def apply[T](
    dispose: () => Unit,
    getProxy: () => js.Promise[T],
    withSyncedResources: js.Array[Uri] => js.Promise[T]
  ): MonacoWebWorker[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getProxy = js.Any.fromFunction0(getProxy), withSyncedResources = js.Any.fromFunction1(withSyncedResources))
    __obj.asInstanceOf[MonacoWebWorker[T]]
  }
  @scala.inline
  implicit class MonacoWebWorkerOps[Self[t] <: MonacoWebWorker[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProxy(value: () => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithSyncedResources(value: js.Array[Uri] => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSyncedResources")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

