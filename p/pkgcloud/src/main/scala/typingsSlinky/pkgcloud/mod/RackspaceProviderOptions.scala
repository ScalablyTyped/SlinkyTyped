package typingsSlinky.pkgcloud.mod

import typingsSlinky.pkgcloud.pkgcloudStrings.rackspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RackspaceProviderOptions extends js.Object {
  var apiKey: String = js.native
  var provider: rackspace = js.native
  var region: RackspaceRegions = js.native
  var useInternal: js.UndefOr[Boolean] = js.native
  var username: String = js.native
}

object RackspaceProviderOptions {
  @scala.inline
  def apply(apiKey: String, provider: rackspace, region: RackspaceRegions, username: String): RackspaceProviderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RackspaceProviderOptions]
  }
  @scala.inline
  implicit class RackspaceProviderOptionsOps[Self <: RackspaceProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: rackspace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: RackspaceRegions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInternal")(js.undefined)
        ret
    }
  }
  
}

