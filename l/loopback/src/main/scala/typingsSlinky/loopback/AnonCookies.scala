package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCookies extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.native
  var currentUserLiteral: js.UndefOr[String] = js.native
  var enableDoublecheck: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Array[_]] = js.native
  var model: js.UndefOr[js.Function0[Unit | String]] = js.native
  var overwriteExistingToken: js.UndefOr[Boolean] = js.native
  var params: js.UndefOr[js.Array[_]] = js.native
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.native
}

object AnonCookies {
  @scala.inline
  def apply(): AnonCookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCookies]
  }
  @scala.inline
  implicit class AnonCookiesOps[Self <: AnonCookies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookies(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentUserLiteral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentUserLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentUserLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentUserLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDoublecheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoublecheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDoublecheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoublecheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: () => Unit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteExistingToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteExistingToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteExistingToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteExistingToken")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDefaultTokenKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDefaultTokenKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDefaultTokenKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDefaultTokenKeys")(js.undefined)
        ret
    }
  }
  
}

