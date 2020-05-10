package typingsSlinky.axiosTokenInterceptor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
@js.native
trait InterceptorOptions extends js.Object {
  var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.native
  var header: js.UndefOr[String] = js.native
  var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.native
  var token: js.UndefOr[String] = js.native
}

object InterceptorOptions {
  @scala.inline
  def apply(): InterceptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptorOptions]
  }
  @scala.inline
  implicit class InterceptorOptionsOps[Self <: InterceptorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetToken(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormatter(value: /* token */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

