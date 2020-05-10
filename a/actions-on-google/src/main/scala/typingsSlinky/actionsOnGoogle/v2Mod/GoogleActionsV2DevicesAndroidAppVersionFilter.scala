package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DevicesAndroidAppVersionFilter extends js.Object {
  /**
    * Max version code, inclusive.
    * The range considered is [min_version:max_version].
    * A null range implies any version.
    * Examples:
    * To specify a single version use: [target_version:target_version].
    * To specify any version leave min_version and max_version unspecified.
    * To specify all versions until max_version, leave min_version unspecified.
    * To specify all versions from min_version, leave max_version unspecified.
    */
  var maxVersion: js.UndefOr[Double] = js.native
  /**
    * Min version code or 0, inclusive.
    */
  var minVersion: js.UndefOr[Double] = js.native
}

object GoogleActionsV2DevicesAndroidAppVersionFilter {
  @scala.inline
  def apply(): GoogleActionsV2DevicesAndroidAppVersionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DevicesAndroidAppVersionFilter]
  }
  @scala.inline
  implicit class GoogleActionsV2DevicesAndroidAppVersionFilterOps[Self <: GoogleActionsV2DevicesAndroidAppVersionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(js.undefined)
        ret
    }
  }
  
}

