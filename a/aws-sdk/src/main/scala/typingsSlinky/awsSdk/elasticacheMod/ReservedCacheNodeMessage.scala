package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedCacheNodeMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
    */
  var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.native
}

object ReservedCacheNodeMessage {
  @scala.inline
  def apply(): ReservedCacheNodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodeMessage]
  }
  @scala.inline
  implicit class ReservedCacheNodeMessageOps[Self <: ReservedCacheNodeMessage] (val x: Self) extends AnyVal {
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
    def withReservedCacheNodes(value: ReservedCacheNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedCacheNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNodes")(js.undefined)
        ret
    }
  }
  
}

