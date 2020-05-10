package typingsSlinky.nodePushnotifications.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /** apn and gcm for ios */
  var action: js.UndefOr[String] = js.native
  /** apn, will take precedence over title and body. It is also accepted a text message in alert */
  var alert: js.UndefOr[js.Object | String] = js.native
  /** gcm for ios, apn */
  var badge: js.UndefOr[Double] = js.native
  /** REQUIRED */
  var body: String = js.native
  /** gcm, apn */
  var bodyLocArgs: js.UndefOr[String] = js.native
  /** apn and gcm for ios */
  var category: js.UndefOr[String] = js.native
  /** gcm for android. In ios, category will be used if not supplied */
  var clickAction: js.UndefOr[String] = js.native
  /** gcm for android, used as collapseId in apn */
  var collapseKey: js.UndefOr[String] = js.native
  /** gcm for android */
  var color: js.UndefOr[String] = js.native
  /** ADM */
  var consolidationKey: js.UndefOr[String] = js.native
  /** gcm for android */
  var contentAvailable: js.UndefOr[Boolean | String] = js.native
  var custom: js.UndefOr[(StringDictionary[String | Double]) | String] = js.native
  /** gcm for android */
  var delayWhileIdle: js.UndefOr[Boolean] = js.native
  /** gcm for android */
  var dryRun: js.UndefOr[Boolean] = js.native
  /** wns */
  var duration: js.UndefOr[String] = js.native
  /** apn */
  var encoding: js.UndefOr[String] = js.native
  /** seconds */
  var expiry: js.UndefOr[Double] = js.native
  /** wns */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /** gcm for android */
  var icon: js.UndefOr[String] = js.native
  /** wns */
  var launch: js.UndefOr[String] = js.native
  /** apn and gcm for ios */
  var launchImage: js.UndefOr[String] = js.native
  /** gcm, apn */
  var locKey: js.UndefOr[String] = js.native
  /** apn and gcm for ios */
  var mdm: js.UndefOr[String] = js.native
  /** apn */
  var mutableContent: js.UndefOr[Double] = js.native
  /**
    * gcm, apn. Supported values are 'high' or 'normal' (gcm). Will be translated to 10 and 5 for apn. Defaults
    * to 'high'
    */
  var priority: js.UndefOr[String] = js.native
  /** gcm for android */
  var restrictedPackageName: js.UndefOr[String] = js.native
  /** gcm, apn */
  var retries: js.UndefOr[Double] = js.native
  /** gcm, apn */
  var sound: js.UndefOr[String] = js.native
  /** gcm for android */
  var tag: js.UndefOr[String] = js.native
  /** if both expiry and timeToLive are given, expiry will take precedency */
  var timeToLive: js.UndefOr[Double] = js.native
  /** REQUIRED */
  var title: String = js.native
  /** gcm, apn */
  var titleLocArgs: js.UndefOr[String] = js.native
  /** gcm, apn */
  var titleLocKey: js.UndefOr[String] = js.native
  /** apn and gcm for ios */
  var topic: js.UndefOr[String] = js.native
  /** apn and gcm for ios */
  var truncateAtWordEnd: js.UndefOr[Boolean] = js.native
  /** apn and gcm for ios */
  var urlArgs: js.UndefOr[String] = js.native
}

object Data {
  @scala.inline
  def apply(body: String, title: String): Data = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAlert(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyLocArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withClickAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAction")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withConsolidationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsolidationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAvailable(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: (StringDictionary[String | Double]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayWhileIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayWhileIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayWhileIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayWhileIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchImage")(js.undefined)
        ret
    }
    @scala.inline
    def withLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMdm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdm")(js.undefined)
        ret
    }
    @scala.inline
    def withMutableContent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutableContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLocArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateAtWordEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateAtWordEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateAtWordEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateAtWordEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlArgs")(js.undefined)
        ret
    }
  }
  
}

