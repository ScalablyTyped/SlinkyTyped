package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetForRepo extends js.Object {
  var get: ParamsLicense
  var getForRepo: Url
  var list: DeprecatedMethod
  var listCommonlyUsed: UrlString
}

object GetForRepo {
  @scala.inline
  def apply(get: ParamsLicense, getForRepo: Url, list: DeprecatedMethod, listCommonlyUsed: UrlString): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommonlyUsed = listCommonlyUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
}

