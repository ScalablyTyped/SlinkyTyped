package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionManager extends js.Object {
  /**
  			 * Indicates whether the manager is ready.
  			 */
  val isReady: Boolean = js.native
  /**
  			 * A Thenable that is fulfilled when the manager is ready.
  			 */
  val ready: Thenable[Unit] = js.native
  val specs: js.UndefOr[IAllKernels] = js.native
  def shutdown(id: String): Thenable[Unit] = js.native
  def startNew(options: ISessionOptions): Thenable[ISession] = js.native
}

object SessionManager {
  @scala.inline
  def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => Thenable[Unit],
    startNew: ISessionOptions => Thenable[ISession]
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), startNew = js.Any.fromFunction1(startNew))
    __obj.asInstanceOf[SessionManager]
  }
  @scala.inline
  implicit class SessionManagerOps[Self <: SessionManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdown(value: String => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartNew(value: ISessionOptions => Thenable[ISession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpecs(value: IAllKernels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.undefined)
        ret
    }
  }
  
}

