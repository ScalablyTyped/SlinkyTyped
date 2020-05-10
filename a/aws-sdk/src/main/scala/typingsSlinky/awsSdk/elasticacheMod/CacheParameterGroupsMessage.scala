package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupsMessage extends js.Object {
  /**
    * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
    */
  var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheParameterGroupsMessage {
  @scala.inline
  def apply(): CacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupsMessage]
  }
  @scala.inline
  implicit class CacheParameterGroupsMessageOps[Self <: CacheParameterGroupsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheParameterGroups(value: CacheParameterGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroups")(js.undefined)
        ret
    }
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
  }
  
}

