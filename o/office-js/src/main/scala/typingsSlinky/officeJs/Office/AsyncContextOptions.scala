package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an option for preserving context data of any type, unchanged, for use in a callback.
  */
@js.native
trait AsyncContextOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
}

object AsyncContextOptions {
  @scala.inline
  def apply(): AsyncContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptions]
  }
  @scala.inline
  implicit class AsyncContextOptionsOps[Self <: AsyncContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(js.undefined)
        ret
    }
  }
  
}

