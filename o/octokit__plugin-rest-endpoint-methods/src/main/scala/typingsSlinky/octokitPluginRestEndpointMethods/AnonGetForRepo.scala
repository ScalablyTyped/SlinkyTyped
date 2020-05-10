package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetForRepo extends js.Object {
  var get: AnonParamsAnonLicense = js.native
  var getForRepo: AnonUrl = js.native
  var list: AnonDeprecatedMethod = js.native
  var listCommonlyUsed: AnonUrlString = js.native
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
  @scala.inline
  implicit class AnonGetForRepoOps[Self <: AnonGetForRepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonParamsAnonLicense): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetForRepo(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonDeprecatedMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommonlyUsed(value: AnonUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommonlyUsed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

