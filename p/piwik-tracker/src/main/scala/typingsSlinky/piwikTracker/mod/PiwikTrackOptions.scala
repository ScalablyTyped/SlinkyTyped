package typingsSlinky.piwikTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// refer to http://developer.piwik.org/api-reference/tracking-api
@js.native
trait PiwikTrackOptions extends js.Object {
  var _cvar: js.UndefOr[String] = js.native
  var _ects: js.UndefOr[Double] = js.native
  var _id: js.UndefOr[String] = js.native
  var _idts: js.UndefOr[String] = js.native
  var _idvc: js.UndefOr[String] = js.native
  var _rck: js.UndefOr[String] = js.native
  var _rcn: js.UndefOr[String] = js.native
  var _viewts: js.UndefOr[String] = js.native
  // Recommended parameters
  var action_name: js.UndefOr[String] = js.native
  var apiv: js.UndefOr[Double] = js.native
  var c_i: js.UndefOr[String] = js.native
  // Optional Content Tracking info
  var c_n: js.UndefOr[String] = js.native
  var c_p: js.UndefOr[String] = js.native
  var c_t: js.UndefOr[String] = js.native
  var cdt: js.UndefOr[String] = js.native
  var cid: js.UndefOr[String] = js.native
  var cip: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var cs: js.UndefOr[String] = js.native
  // Optional Action info
  var cvar: js.UndefOr[String] = js.native
  var download: js.UndefOr[String] = js.native
  var e_a: js.UndefOr[String] = js.native
  // Optional Event Tracking info
  var e_c: js.UndefOr[String] = js.native
  var e_n: js.UndefOr[String] = js.native
  var e_v: js.UndefOr[String] = js.native
  var ec_dt: js.UndefOr[Double] = js.native
  // Optional Ecommerce info
  var ec_id: js.UndefOr[String] = js.native
  var ec_items: js.UndefOr[String] = js.native
  var ec_sh: js.UndefOr[Double] = js.native
  var ec_st: js.UndefOr[Double] = js.native
  var ec_tx: js.UndefOr[Double] = js.native
  var gt_ms: js.UndefOr[Double] = js.native
  var h: js.UndefOr[Double] = js.native
  var idgoal: js.UndefOr[Double] = js.native
  var lang: js.UndefOr[String] = js.native
  var lat: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var long: js.UndefOr[String] = js.native
  var m: js.UndefOr[Double] = js.native
  var new_visit: js.UndefOr[Double] = js.native
  var rand: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var res: js.UndefOr[String] = js.native
  var revenue: js.UndefOr[Double] = js.native
  var s: js.UndefOr[Double] = js.native
  var search: js.UndefOr[String] = js.native
  var search_cat: js.UndefOr[String] = js.native
  var search_count: js.UndefOr[Double] = js.native
  // Other parameters
  var send_image: js.UndefOr[Double] = js.native
  // Other parameters (require authentication via token_auth)
  var token_auth: js.UndefOr[String] = js.native
  var ua: js.UndefOr[String] = js.native
  var uid: js.UndefOr[String] = js.native
  // Required parameters
  var url: String = js.native
  // Optional User info
  var urlref: js.UndefOr[String] = js.native
}

object PiwikTrackOptions {
  @scala.inline
  def apply(url: String): PiwikTrackOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiwikTrackOptions]
  }
  @scala.inline
  implicit class PiwikTrackOptionsOps[Self <: PiwikTrackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_cvar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cvar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cvar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cvar")(js.undefined)
        ret
    }
    @scala.inline
    def with_ects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ects")(js.undefined)
        ret
    }
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def with_idts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_idts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idts")(js.undefined)
        ret
    }
    @scala.inline
    def with_idvc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_idvc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idvc")(js.undefined)
        ret
    }
    @scala.inline
    def with_rck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rck")(js.undefined)
        ret
    }
    @scala.inline
    def with_rcn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rcn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rcn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rcn")(js.undefined)
        ret
    }
    @scala.inline
    def with_viewts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_viewts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_viewts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_viewts")(js.undefined)
        ret
    }
    @scala.inline
    def withAction_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_name")(js.undefined)
        ret
    }
    @scala.inline
    def withApiv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiv")(js.undefined)
        ret
    }
    @scala.inline
    def withC_i(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC_i: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_i")(js.undefined)
        ret
    }
    @scala.inline
    def withC_n(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC_n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_n")(js.undefined)
        ret
    }
    @scala.inline
    def withC_p(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC_p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_p")(js.undefined)
        ret
    }
    @scala.inline
    def withC_t(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC_t: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c_t")(js.undefined)
        ret
    }
    @scala.inline
    def withCdt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdt")(js.undefined)
        ret
    }
    @scala.inline
    def withCid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withCip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cip")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cs")(js.undefined)
        ret
    }
    @scala.inline
    def withCvar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvar")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withE_a(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_a")(js.undefined)
        ret
    }
    @scala.inline
    def withE_c(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE_c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_c")(js.undefined)
        ret
    }
    @scala.inline
    def withE_n(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE_n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_n")(js.undefined)
        ret
    }
    @scala.inline
    def withE_v(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE_v: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e_v")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_dt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_dt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_dt")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_items")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_sh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_sh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_sh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_sh")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_st(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_st")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_st: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_st")(js.undefined)
        ret
    }
    @scala.inline
    def withEc_tx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_tx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc_tx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec_tx")(js.undefined)
        ret
    }
    @scala.inline
    def withGt_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGt_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withIdgoal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idgoal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdgoal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idgoal")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLong(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_visit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_visit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_visit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_visit")(js.undefined)
        ret
    }
    @scala.inline
    def withRand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(js.undefined)
        ret
    }
    @scala.inline
    def withRevenue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_cat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_cat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_cat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_cat")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_count")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_image(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_image")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_auth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_auth")(js.undefined)
        ret
    }
    @scala.inline
    def withUa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlref")(js.undefined)
        ret
    }
  }
  
}

