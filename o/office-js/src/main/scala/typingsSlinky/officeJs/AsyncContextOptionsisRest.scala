package typingsSlinky.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-js.Office.AsyncContextOptions & {  isRest ? :boolean} */
@js.native
trait AsyncContextOptionsisRest extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  var isRest: js.UndefOr[Boolean] = js.native
}

object AsyncContextOptionsisRest {
  @scala.inline
  def apply(): AsyncContextOptionsisRest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptionsisRest]
  }
  @scala.inline
  implicit class AsyncContextOptionsisRestOps[Self <: AsyncContextOptionsisRest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withIsRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRest")(js.undefined)
        ret
    }
  }
  
}

