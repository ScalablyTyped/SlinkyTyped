package typingsSlinky.jenkins.anon

import typingsSlinky.jenkins.jenkinsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrumbIssuer extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var crumbIssuer: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var promisify: `true` = js.native
}

object CrumbIssuer {
  @scala.inline
  def apply(promisify: `true`): CrumbIssuer = {
    val __obj = js.Dynamic.literal(promisify = promisify.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrumbIssuer]
  }
  @scala.inline
  implicit class CrumbIssuerOps[Self <: CrumbIssuer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromisify(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promisify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCrumbIssuer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crumbIssuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrumbIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crumbIssuer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
  }
  
}

