package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetConductCode extends js.Object {
  var getConductCode: AnonParamsAnonKey = js.native
  var getForRepo: AnonParamsAnonRepo = js.native
  var listConductCodes: AnonHeadersAnonAcceptMethodString = js.native
}

object AnonGetConductCode {
  @scala.inline
  def apply(
    getConductCode: AnonParamsAnonKey,
    getForRepo: AnonParamsAnonRepo,
    listConductCodes: AnonHeadersAnonAcceptMethodString
  ): AnonGetConductCode = {
    val __obj = js.Dynamic.literal(getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], listConductCodes = listConductCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetConductCode]
  }
  @scala.inline
  implicit class AnonGetConductCodeOps[Self <: AnonGetConductCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConductCode(value: AnonParamsAnonKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConductCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetForRepo(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListConductCodes(value: AnonHeadersAnonAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConductCodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

