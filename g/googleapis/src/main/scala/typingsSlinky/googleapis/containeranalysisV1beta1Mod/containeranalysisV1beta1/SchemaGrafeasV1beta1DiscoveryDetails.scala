package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a discovery occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1DiscoveryDetails extends js.Object {
  /**
    * Required. Analysis status for the discovered resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.native
}

object SchemaGrafeasV1beta1DiscoveryDetails {
  @scala.inline
  def apply(): SchemaGrafeasV1beta1DiscoveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1DiscoveryDetails]
  }
  @scala.inline
  implicit class SchemaGrafeasV1beta1DiscoveryDetailsOps[Self <: SchemaGrafeasV1beta1DiscoveryDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovered(value: SchemaDiscovered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovered")(js.undefined)
        ret
    }
  }
  
}

