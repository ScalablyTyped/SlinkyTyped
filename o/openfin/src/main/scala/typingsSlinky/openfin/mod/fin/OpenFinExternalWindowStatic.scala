package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinExternalWindowStatic extends js.Object {
  /**
    * Returns an External Window object that wraps an existing window.
    */
  def wrap(appUuid: String, windowName: String): js.Promise[OpenFinExternalWindow] = js.native
  /**
    * Synchronously returns an External Window object that wraps an existing window.
    */
  def wrapSync(appUuid: String, windowName: String): OpenFinExternalWindow = js.native
}

object OpenFinExternalWindowStatic {
  @scala.inline
  def apply(
    wrap: (String, String) => js.Promise[OpenFinExternalWindow],
    wrapSync: (String, String) => OpenFinExternalWindow
  ): OpenFinExternalWindowStatic = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction2(wrap), wrapSync = js.Any.fromFunction2(wrapSync))
    __obj.asInstanceOf[OpenFinExternalWindowStatic]
  }
  @scala.inline
  implicit class OpenFinExternalWindowStaticOps[Self <: OpenFinExternalWindowStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrap(value: (String, String) => js.Promise[OpenFinExternalWindow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWrapSync(value: (String, String) => OpenFinExternalWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

