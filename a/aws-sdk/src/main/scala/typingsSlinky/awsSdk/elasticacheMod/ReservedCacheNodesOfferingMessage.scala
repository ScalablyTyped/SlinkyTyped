package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedCacheNodesOfferingMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved cache node offerings. Each element in the list contains detailed information about one offering.
    */
  var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.native
}

object ReservedCacheNodesOfferingMessage {
  @scala.inline
  def apply(): ReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodesOfferingMessage]
  }
  @scala.inline
  implicit class ReservedCacheNodesOfferingMessageOps[Self <: ReservedCacheNodesOfferingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedCacheNodesOfferings(value: ReservedCacheNodesOfferingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodesOfferings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedCacheNodesOfferings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodesOfferings")(js.undefined)
        ret
    }
  }
  
}

