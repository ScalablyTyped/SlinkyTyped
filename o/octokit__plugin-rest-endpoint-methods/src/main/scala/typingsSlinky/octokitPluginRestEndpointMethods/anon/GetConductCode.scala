package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConductCode extends js.Object {
  var getConductCode: ParamsKey
  var getForRepo: ParamsRepo
  var listConductCodes: HeadersAcceptMethodString
}

object GetConductCode {
  @scala.inline
  def apply(getConductCode: ParamsKey, getForRepo: ParamsRepo, listConductCodes: HeadersAcceptMethodString): GetConductCode = {
    val __obj = js.Dynamic.literal(getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], listConductCodes = listConductCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
}

