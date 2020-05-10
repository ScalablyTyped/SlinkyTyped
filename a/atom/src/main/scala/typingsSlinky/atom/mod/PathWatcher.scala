package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathWatcher extends DisposableLike {
  /**
    *  Return a Promise that will resolve when the underlying native watcher is
    *  ready to begin sending events.
    */
  def getStartPromise(): js.Promise[Unit] = js.native
  /** Invokes a function when any errors related to this watcher are reported. */
  def onDidError(callback: js.Function1[/* error */ js.Error, Unit]): Disposable = js.native
}

object PathWatcher {
  @scala.inline
  def apply(
    dispose: () => Unit,
    getStartPromise: () => js.Promise[Unit],
    onDidError: js.Function1[/* error */ js.Error, Unit] => Disposable
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getStartPromise = js.Any.fromFunction0(getStartPromise), onDidError = js.Any.fromFunction1(onDidError))
    __obj.asInstanceOf[PathWatcher]
  }
  @scala.inline
  implicit class PathWatcherOps[Self <: PathWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStartPromise(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartPromise")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDidError(value: js.Function1[/* error */ js.Error, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

