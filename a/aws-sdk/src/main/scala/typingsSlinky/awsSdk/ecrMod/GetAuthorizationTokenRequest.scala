package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenRequest extends js.Object {
  /**
    * A list of AWS account IDs that are associated with the registries for which to get AuthorizationData objects. If you do not specify a registry, the default registry is assumed.
    */
  var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.native
}

object GetAuthorizationTokenRequest {
  @scala.inline
  def apply(): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  @scala.inline
  implicit class GetAuthorizationTokenRequestOps[Self <: GetAuthorizationTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistryIds(value: GetAuthorizationTokenRegistryIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryIds")(js.undefined)
        ret
    }
  }
  
}

