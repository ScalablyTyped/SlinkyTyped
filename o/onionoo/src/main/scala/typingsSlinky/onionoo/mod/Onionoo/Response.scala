package typingsSlinky.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[TRelay, TBridge] extends js.Object {
  var bridges: js.Array[TBridge] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status was published.
    * Indicates how recent the bridge objects in this document are.
    */
  var bridges_published: String = js.native
  /**
    * Number of skipped bridges as requested by a positive `offset` parameter value. Omitted if zero.
    */
  var bridges_skipped: js.UndefOr[Double] = js.native
  /**
    * Number of truncated bridges as requested by a positive `limit` parameter value. Omitted if zero.
    */
  var bridges_truncated: js.UndefOr[Double] = js.native
  /**
    * Git revision of the Onionoo instance's software used to write this response, which will be omitted if unknown.
    */
  var build_revision: js.UndefOr[String] = js.native
  /**
    * UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major
    * protocol changes are planned.
    */
  var next_major_version_scheduled: js.UndefOr[String] = js.native
  var relays: js.Array[TRelay] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid.
    * Indicates how recent the relay objects in this document are.
    */
  var relays_published: String = js.native
  /**
    * Number of skipped relays as requested by a positive "offset" parameter value. Omitted if zero.
    */
  var relays_skipped: js.UndefOr[Double] = js.native
  /**
    * Number of truncated relays as requested by a positive "limit" parameter value. Omitted if zero.
    */
  var relays_truncated: js.UndefOr[Double] = js.native
  /**
    * Onionoo protocol version string.
    */
  var version: String = js.native
}

object Response {
  @scala.inline
  def apply[TRelay, TBridge](
    bridges: js.Array[TBridge],
    bridges_published: String,
    relays: js.Array[TRelay],
    relays_published: String,
    version: String
  ): Response[TRelay, TBridge] = {
    val __obj = js.Dynamic.literal(bridges = bridges.asInstanceOf[js.Any], bridges_published = bridges_published.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], relays_published = relays_published.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TRelay, TBridge]]
  }
  @scala.inline
  implicit class ResponseOps[Self[trelay, tbridge] <: Response[trelay, tbridge], TRelay, TBridge] (val x: Self[TRelay, TBridge]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRelay, TBridge] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRelay, TBridge]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRelay, TBridge]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRelay, TBridge]) with Other]
    @scala.inline
    def withBridges(value: js.Array[TBridge]): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridges_published(value: String): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges_published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelays(value: js.Array[TRelay]): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelays_published(value: String): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays_published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridges_skipped(value: Double): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges_skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridges_skipped: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges_skipped")(js.undefined)
        ret
    }
    @scala.inline
    def withBridges_truncated(value: Double): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges_truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridges_truncated: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridges_truncated")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild_revision(value: String): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build_revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild_revision: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build_revision")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_major_version_scheduled(value: String): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_major_version_scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_major_version_scheduled: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_major_version_scheduled")(js.undefined)
        ret
    }
    @scala.inline
    def withRelays_skipped(value: Double): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays_skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelays_skipped: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays_skipped")(js.undefined)
        ret
    }
    @scala.inline
    def withRelays_truncated(value: Double): Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays_truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelays_truncated: Self[TRelay, TBridge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relays_truncated")(js.undefined)
        ret
    }
  }
  
}

