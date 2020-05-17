package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConductCode extends js.Object {
  var getConductCode: ParamsKey = js.native
  var getForRepo: ParamsRepo = js.native
  var listConductCodes: HeadersAcceptMethodString = js.native
}

object GetConductCode {
  @scala.inline
  def apply(getConductCode: ParamsKey, getForRepo: ParamsRepo, listConductCodes: HeadersAcceptMethodString): GetConductCode = {
    val __obj = js.Dynamic.literal(getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], listConductCodes = listConductCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  @scala.inline
  implicit class GetConductCodeOps[Self <: GetConductCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConductCode(value: ParamsKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConductCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetForRepo(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListConductCodes(value: HeadersAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConductCodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

