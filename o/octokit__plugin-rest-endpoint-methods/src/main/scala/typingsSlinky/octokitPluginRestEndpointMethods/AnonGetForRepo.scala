package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetForRepo extends js.Object {
  var get: AnonParamsAnonLicense
  var getForRepo: AnonUrl
  var list: AnonDeprecatedMethod
  var listCommonlyUsed: AnonUrlString
}

object AnonGetForRepo {
  @scala.inline
  def apply(
    get: AnonParamsAnonLicense,
    getForRepo: AnonUrl,
    list: AnonDeprecatedMethod,
    listCommonlyUsed: AnonUrlString
  ): AnonGetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommonlyUsed = listCommonlyUsed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetForRepo]
  }
}

