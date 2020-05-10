package typingsSlinky.ink.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
  	 * Manually unmount the whole Ink app.
  	 */
  var unmount: Unmount = js.native
  /**
  	 * Replace previous root node with a new one or update props of the current root node.
  	 */
  def rerender[Props](tree: ReactElement): Unit = js.native
  /**
  	 * Returns a promise, which resolves when app is unmounted.
  	 */
  def waitUntilExit(): js.Promise[Unit] = js.native
}

object Instance {
  @scala.inline
  def apply(rerender: ReactElement => Unit, unmount: () => Unit, waitUntilExit: () => js.Promise[Unit]): Instance = {
    val __obj = js.Dynamic.literal(rerender = js.Any.fromFunction1(rerender), unmount = js.Any.fromFunction0(unmount), waitUntilExit = js.Any.fromFunction0(waitUntilExit))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRerender(value: ReactElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWaitUntilExit(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitUntilExit")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

