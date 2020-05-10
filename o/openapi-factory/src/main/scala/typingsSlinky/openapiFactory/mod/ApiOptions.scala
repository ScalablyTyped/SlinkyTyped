package typingsSlinky.openapiFactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiOptions extends js.Object {
  var errorMiddleware: js.UndefOr[js.Function0[_]] = js.native
  var requestMiddleware: js.UndefOr[js.Function0[_]] = js.native
  var responseMiddleware: js.UndefOr[js.Function0[_]] = js.native
}

object ApiOptions {
  @scala.inline
  def apply(): ApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiOptions]
  }
  @scala.inline
  implicit class ApiOptionsOps[Self <: ApiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMiddleware(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMiddleware")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMiddleware(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMiddleware")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequestMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMiddleware(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMiddleware")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResponseMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMiddleware")(js.undefined)
        ret
    }
  }
  
}

