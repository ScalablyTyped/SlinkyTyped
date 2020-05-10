package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * An array of objects with information about product views and provisioning artifacts.
    */
  var ProvisioningArtifactViews: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactViews] = js.native
}

object ListProvisioningArtifactsForServiceActionOutput {
  @scala.inline
  def apply(): ListProvisioningArtifactsForServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
  }
  @scala.inline
  implicit class ListProvisioningArtifactsForServiceActionOutputOps[Self <: ListProvisioningArtifactsForServiceActionOutput] (val x: Self) extends AnyVal {
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
    def withProvisioningArtifactViews(value: ProvisioningArtifactViews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactViews")(js.undefined)
        ret
    }
  }
  
}

