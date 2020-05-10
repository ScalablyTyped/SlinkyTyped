package typingsSlinky.axiosTokenInterceptor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenCacheOptions extends js.Object {
  var getMaxAge: js.UndefOr[js.Function0[Double]] = js.native
  var maxAge: js.UndefOr[Double] = js.native
}

object TokenCacheOptions {
  @scala.inline
  def apply(): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCacheOptions]
  }
  @scala.inline
  implicit class TokenCacheOptionsOps[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMaxAge(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxAge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
  }
  
}

