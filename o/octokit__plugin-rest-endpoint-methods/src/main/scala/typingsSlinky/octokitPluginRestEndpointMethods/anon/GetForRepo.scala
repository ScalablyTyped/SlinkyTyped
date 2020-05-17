package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetForRepo extends js.Object {
  var get: ParamsLicense = js.native
  var getForRepo: Url = js.native
  var list: DeprecatedMethod = js.native
  var listCommonlyUsed: UrlString = js.native
}

object GetForRepo {
  @scala.inline
  def apply(get: ParamsLicense, getForRepo: Url, list: DeprecatedMethod, listCommonlyUsed: UrlString): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommonlyUsed = listCommonlyUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
  @scala.inline
  implicit class GetForRepoOps[Self <: GetForRepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: ParamsLicense): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetForRepo(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: DeprecatedMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommonlyUsed(value: UrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommonlyUsed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

