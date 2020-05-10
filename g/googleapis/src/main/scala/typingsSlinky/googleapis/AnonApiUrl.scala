package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiUrl extends js.Object {
  var apiUrl: js.UndefOr[String] = js.native
  var browserUrl: js.UndefOr[String] = js.native
}

object AnonApiUrl {
  @scala.inline
  def apply(): AnonApiUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApiUrl]
  }
  @scala.inline
  implicit class AnonApiUrlOps[Self <: AnonApiUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserUrl")(js.undefined)
        ret
    }
  }
  
}

