package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetConductCode extends js.Object {
  var getConductCode: AnonParamsAnonKey
  var getForRepo: AnonParamsAnonRepo
  var listConductCodes: AnonHeadersAnonAcceptMethodString
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
}

