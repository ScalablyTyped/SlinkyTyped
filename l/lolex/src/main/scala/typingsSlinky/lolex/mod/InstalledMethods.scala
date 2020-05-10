package typingsSlinky.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional methods that installed clock have.
  */
@js.native
trait InstalledMethods extends js.Object {
  var methods: js.Array[FakeMethod] = js.native
  /**
    * Restores the original methods on the context that was passed to lolex.install,
    * or the native timers if no context was given.
    */
  def uninstall(): Unit = js.native
}

object InstalledMethods {
  @scala.inline
  def apply(methods: js.Array[FakeMethod], uninstall: () => Unit): InstalledMethods = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = js.Any.fromFunction0(uninstall))
    __obj.asInstanceOf[InstalledMethods]
  }
  @scala.inline
  implicit class InstalledMethodsOps[Self <: InstalledMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: js.Array[FakeMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstall(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

