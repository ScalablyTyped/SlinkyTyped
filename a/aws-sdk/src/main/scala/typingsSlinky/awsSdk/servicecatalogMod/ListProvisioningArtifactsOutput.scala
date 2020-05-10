package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningArtifactsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetails] = js.native
}

object ListProvisioningArtifactsOutput {
  @scala.inline
  def apply(): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
  @scala.inline
  implicit class ListProvisioningArtifactsOutputOps[Self <: ListProvisioningArtifactsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactDetails(value: ProvisioningArtifactDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactDetails")(js.undefined)
        ret
    }
  }
  
}

