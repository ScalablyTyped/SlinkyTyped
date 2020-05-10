package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracking parameters supported by Dynamic Link.
  */
@js.native
trait SchemaAnalyticsInfo extends js.Object {
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[SchemaGooglePlayAnalytics] = js.native
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[SchemaITunesConnectAnalytics] = js.native
}

object SchemaAnalyticsInfo {
  @scala.inline
  def apply(): SchemaAnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsInfo]
  }
  @scala.inline
  implicit class SchemaAnalyticsInfoOps[Self <: SchemaAnalyticsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGooglePlayAnalytics(value: SchemaGooglePlayAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlayAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesConnectAnalytics(value: SchemaITunesConnectAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesConnectAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesConnectAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesConnectAnalytics")(js.undefined)
        ret
    }
  }
  
}

