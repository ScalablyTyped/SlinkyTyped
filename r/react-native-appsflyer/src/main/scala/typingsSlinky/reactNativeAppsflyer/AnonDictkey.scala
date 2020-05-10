package typingsSlinky.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.Organic
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.`Non-organic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var af_referrer_customer_id: js.UndefOr[String] = js.native
  var af_referrer_uid: js.UndefOr[String] = js.native
  var af_status: Organic | `Non-organic` = js.native
  var is_first_launch: Boolean = js.native
  var media_source: String = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(af_status: Organic | `Non-organic`, is_first_launch: Boolean, media_source: String): AnonDictkey = {
    val __obj = js.Dynamic.literal(af_status = af_status.asInstanceOf[js.Any], is_first_launch = is_first_launch.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAf_status(value: Organic | `Non-organic`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("af_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_first_launch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_launch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAf_referrer_customer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("af_referrer_customer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAf_referrer_customer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("af_referrer_customer_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAf_referrer_uid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("af_referrer_uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAf_referrer_uid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("af_referrer_uid")(js.undefined)
        ret
    }
  }
  
}

