package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressEndpoint extends js.Object {
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[string] = js.native
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[string] = js.native
}

object EgressEndpoint {
  @scala.inline
  def apply(): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressEndpoint]
  }
  @scala.inline
  implicit class EgressEndpointOps[Self <: EgressEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackagingConfigurationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackagingConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

