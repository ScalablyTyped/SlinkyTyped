package typingsSlinky.officeJsPreview.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-js-preview.Office.AsyncContextOptions & {  isInline  :boolean} */
@js.native
trait AsyncContextOptionsisInli extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  var isInline: Boolean = js.native
}

object AsyncContextOptionsisInli {
  @scala.inline
  def apply(isInline: Boolean): AsyncContextOptionsisInli = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContextOptionsisInli]
  }
  @scala.inline
  implicit class AsyncContextOptionsisInliOps[Self <: AsyncContextOptionsisInli] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
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

