package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetSummary extends js.Object {
  /**
    * The GeoMatchSetId for an GeoMatchSet. You can use GeoMatchSetId in a GetGeoMatchSet request to get detailed information about an GeoMatchSet.
    */
  var GeoMatchSetId: ResourceId = js.native
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: ResourceName = js.native
}

object GeoMatchSetSummary {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId, Name: ResourceName): GeoMatchSetSummary = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetSummary]
  }
  @scala.inline
  implicit class GeoMatchSetSummaryOps[Self <: GeoMatchSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

