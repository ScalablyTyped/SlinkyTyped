package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponseInjected extends js.Object {
  var about_ad_params: String = js.native
  var ad_id: String = js.native
  var ad_title: String = js.native
  var cookies: js.Array[String] = js.native
  var direct_share: Boolean = js.native
  var display_viewability_eligible: Boolean = js.native
  var hide_flow_type: Double = js.native
  var hide_label: String = js.native
  var hide_reasons_v2: js.Array[TimelineFeedResponseHideReasonsV2Item] = js.native
  var invalidation: Null = js.native
  var is_demo: Boolean = js.native
  var is_holdout: Boolean = js.native
  var is_leadgen_native_eligible: Boolean = js.native
  var label: String = js.native
  var lead_gen_form_id: String | Double = js.native
  var show_ad_choices: Boolean = js.native
  var show_icon: Boolean = js.native
  var tracking_token: String = js.native
  var view_tags: js.Array[_] = js.native
}

object TimelineFeedResponseInjected {
  @scala.inline
  def apply(
    about_ad_params: String,
    ad_id: String,
    ad_title: String,
    cookies: js.Array[String],
    direct_share: Boolean,
    display_viewability_eligible: Boolean,
    hide_flow_type: Double,
    hide_label: String,
    hide_reasons_v2: js.Array[TimelineFeedResponseHideReasonsV2Item],
    invalidation: Null,
    is_demo: Boolean,
    is_holdout: Boolean,
    is_leadgen_native_eligible: Boolean,
    label: String,
    lead_gen_form_id: String | Double,
    show_ad_choices: Boolean,
    show_icon: Boolean,
    tracking_token: String,
    view_tags: js.Array[_]
  ): TimelineFeedResponseInjected = {
    val __obj = js.Dynamic.literal(about_ad_params = about_ad_params.asInstanceOf[js.Any], ad_id = ad_id.asInstanceOf[js.Any], ad_title = ad_title.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], direct_share = direct_share.asInstanceOf[js.Any], display_viewability_eligible = display_viewability_eligible.asInstanceOf[js.Any], hide_flow_type = hide_flow_type.asInstanceOf[js.Any], hide_label = hide_label.asInstanceOf[js.Any], hide_reasons_v2 = hide_reasons_v2.asInstanceOf[js.Any], invalidation = invalidation.asInstanceOf[js.Any], is_demo = is_demo.asInstanceOf[js.Any], is_holdout = is_holdout.asInstanceOf[js.Any], is_leadgen_native_eligible = is_leadgen_native_eligible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lead_gen_form_id = lead_gen_form_id.asInstanceOf[js.Any], show_ad_choices = show_ad_choices.asInstanceOf[js.Any], show_icon = show_icon.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any], view_tags = view_tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseInjected]
  }
  @scala.inline
  implicit class TimelineFeedResponseInjectedOps[Self <: TimelineFeedResponseInjected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout_ad_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about_ad_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAd_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAd_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirect_share(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct_share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_viewability_eligible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_viewability_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_flow_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_flow_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_reasons_v2(value: js.Array[TimelineFeedResponseHideReasonsV2Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_reasons_v2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidation(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_demo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_demo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_holdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_holdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_leadgen_native_eligible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_leadgen_native_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLead_gen_form_id(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead_gen_form_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_ad_choices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_ad_choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_icon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracking_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView_tags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

