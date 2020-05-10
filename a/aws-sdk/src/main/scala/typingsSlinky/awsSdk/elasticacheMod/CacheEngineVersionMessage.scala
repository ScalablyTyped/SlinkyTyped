package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEngineVersionMessage extends js.Object {
  /**
    * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
    */
  var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheEngineVersionMessage {
  @scala.inline
  def apply(): CacheEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersionMessage]
  }
  @scala.inline
  implicit class CacheEngineVersionMessageOps[Self <: CacheEngineVersionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheEngineVersions(value: CacheEngineVersionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheEngineVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheEngineVersions")(js.undefined)
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

