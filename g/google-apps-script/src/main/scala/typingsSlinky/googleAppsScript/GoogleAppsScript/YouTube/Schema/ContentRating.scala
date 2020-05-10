package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRating extends js.Object {
  var acbRating: js.UndefOr[String] = js.native
  var agcomRating: js.UndefOr[String] = js.native
  var anatelRating: js.UndefOr[String] = js.native
  var bbfcRating: js.UndefOr[String] = js.native
  var bfvcRating: js.UndefOr[String] = js.native
  var bmukkRating: js.UndefOr[String] = js.native
  var catvRating: js.UndefOr[String] = js.native
  var catvfrRating: js.UndefOr[String] = js.native
  var cbfcRating: js.UndefOr[String] = js.native
  var cccRating: js.UndefOr[String] = js.native
  var cceRating: js.UndefOr[String] = js.native
  var chfilmRating: js.UndefOr[String] = js.native
  var chvrsRating: js.UndefOr[String] = js.native
  var cicfRating: js.UndefOr[String] = js.native
  var cnaRating: js.UndefOr[String] = js.native
  var cncRating: js.UndefOr[String] = js.native
  var csaRating: js.UndefOr[String] = js.native
  var cscfRating: js.UndefOr[String] = js.native
  var czfilmRating: js.UndefOr[String] = js.native
  var djctqRating: js.UndefOr[String] = js.native
  var djctqRatingReasons: js.UndefOr[js.Array[String]] = js.native
  var ecbmctRating: js.UndefOr[String] = js.native
  var eefilmRating: js.UndefOr[String] = js.native
  var egfilmRating: js.UndefOr[String] = js.native
  var eirinRating: js.UndefOr[String] = js.native
  var fcbmRating: js.UndefOr[String] = js.native
  var fcoRating: js.UndefOr[String] = js.native
  var fmocRating: js.UndefOr[String] = js.native
  var fpbRating: js.UndefOr[String] = js.native
  var fpbRatingReasons: js.UndefOr[js.Array[String]] = js.native
  var fskRating: js.UndefOr[String] = js.native
  var grfilmRating: js.UndefOr[String] = js.native
  var icaaRating: js.UndefOr[String] = js.native
  var ifcoRating: js.UndefOr[String] = js.native
  var ilfilmRating: js.UndefOr[String] = js.native
  var incaaRating: js.UndefOr[String] = js.native
  var kfcbRating: js.UndefOr[String] = js.native
  var kijkwijzerRating: js.UndefOr[String] = js.native
  var kmrbRating: js.UndefOr[String] = js.native
  var lsfRating: js.UndefOr[String] = js.native
  var mccaaRating: js.UndefOr[String] = js.native
  var mccypRating: js.UndefOr[String] = js.native
  var mcstRating: js.UndefOr[String] = js.native
  var mdaRating: js.UndefOr[String] = js.native
  var medietilsynetRating: js.UndefOr[String] = js.native
  var mekuRating: js.UndefOr[String] = js.native
  var menaMpaaRating: js.UndefOr[String] = js.native
  var mibacRating: js.UndefOr[String] = js.native
  var mocRating: js.UndefOr[String] = js.native
  var moctwRating: js.UndefOr[String] = js.native
  var mpaaRating: js.UndefOr[String] = js.native
  var mpaatRating: js.UndefOr[String] = js.native
  var mtrcbRating: js.UndefOr[String] = js.native
  var nbcRating: js.UndefOr[String] = js.native
  var nbcplRating: js.UndefOr[String] = js.native
  var nfrcRating: js.UndefOr[String] = js.native
  var nfvcbRating: js.UndefOr[String] = js.native
  var nkclvRating: js.UndefOr[String] = js.native
  var oflcRating: js.UndefOr[String] = js.native
  var pefilmRating: js.UndefOr[String] = js.native
  var rcnofRating: js.UndefOr[String] = js.native
  var resorteviolenciaRating: js.UndefOr[String] = js.native
  var rtcRating: js.UndefOr[String] = js.native
  var rteRating: js.UndefOr[String] = js.native
  var russiaRating: js.UndefOr[String] = js.native
  var skfilmRating: js.UndefOr[String] = js.native
  var smaisRating: js.UndefOr[String] = js.native
  var smsaRating: js.UndefOr[String] = js.native
  var tvpgRating: js.UndefOr[String] = js.native
  var ytRating: js.UndefOr[String] = js.native
}

object ContentRating {
  @scala.inline
  def apply(): ContentRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRating]
  }
  @scala.inline
  implicit class ContentRatingOps[Self <: ContentRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withAgcomRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agcomRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgcomRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agcomRating")(js.undefined)
        ret
    }
    @scala.inline
    def withAnatelRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anatelRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnatelRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anatelRating")(js.undefined)
        ret
    }
    @scala.inline
    def withBbfcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbfcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbfcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbfcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withBfvcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bfvcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBfvcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bfvcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withBmukkRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmukkRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmukkRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmukkRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCatvRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catvRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatvRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catvRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCatvfrRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catvfrRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatvfrRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catvfrRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCbfcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbfcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCbfcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbfcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCccRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cccRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCccRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cccRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCceRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cceRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCceRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cceRating")(js.undefined)
        ret
    }
    @scala.inline
    def withChfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withChvrsRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chvrsRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChvrsRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chvrsRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCicfRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cicfRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCicfRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cicfRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCnaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCnaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCncRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cncRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCncRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cncRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCsaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCscfRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscfRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscfRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscfRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCzfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("czfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCzfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("czfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withDjctqRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djctqRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDjctqRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djctqRating")(js.undefined)
        ret
    }
    @scala.inline
    def withDjctqRatingReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djctqRatingReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDjctqRatingReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djctqRatingReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withEcbmctRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecbmctRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcbmctRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecbmctRating")(js.undefined)
        ret
    }
    @scala.inline
    def withEefilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eefilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEefilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eefilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withEgfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withEirinRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eirinRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEirinRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eirinRating")(js.undefined)
        ret
    }
    @scala.inline
    def withFcbmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcbmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFcbmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcbmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withFcoRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcoRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFcoRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcoRating")(js.undefined)
        ret
    }
    @scala.inline
    def withFmocRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmocRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFmocRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmocRating")(js.undefined)
        ret
    }
    @scala.inline
    def withFpbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withFpbRatingReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpbRatingReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpbRatingReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpbRatingReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withFskRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fskRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFskRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fskRating")(js.undefined)
        ret
    }
    @scala.inline
    def withGrfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIcaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcaaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icaaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIfcoRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifcoRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfcoRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifcoRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIlfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ilfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIlfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ilfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIncaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncaaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incaaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withKfcbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kfcbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKfcbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kfcbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withKijkwijzerRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kijkwijzerRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKijkwijzerRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kijkwijzerRating")(js.undefined)
        ret
    }
    @scala.inline
    def withKmrbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmrbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmrbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmrbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withLsfRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lsfRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLsfRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lsfRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMccaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mccaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMccaaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mccaaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMccypRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mccypRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMccypRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mccypRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMcstRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcstRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMcstRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcstRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMdaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMedietilsynetRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medietilsynetRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedietilsynetRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medietilsynetRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMekuRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mekuRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMekuRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mekuRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMenaMpaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menaMpaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenaMpaaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menaMpaaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMibacRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mibacRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMibacRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mibacRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMocRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMoctwRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moctwRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoctwRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moctwRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMpaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpaaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpaaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMpaatRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpaatRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpaatRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpaatRating")(js.undefined)
        ret
    }
    @scala.inline
    def withMtrcbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtrcbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtrcbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtrcbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withNbcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withNbcplRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbcplRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbcplRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbcplRating")(js.undefined)
        ret
    }
    @scala.inline
    def withNfrcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfrcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNfrcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfrcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withNfvcbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfvcbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNfvcbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfvcbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withNkclvRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nkclvRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNkclvRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nkclvRating")(js.undefined)
        ret
    }
    @scala.inline
    def withOflcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oflcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOflcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oflcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withPefilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pefilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPefilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pefilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRcnofRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcnofRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRcnofRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcnofRating")(js.undefined)
        ret
    }
    @scala.inline
    def withResorteviolenciaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resorteviolenciaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResorteviolenciaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resorteviolenciaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRteRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rteRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRteRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rteRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRussiaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("russiaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRussiaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("russiaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withSkfilmRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skfilmRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkfilmRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skfilmRating")(js.undefined)
        ret
    }
    @scala.inline
    def withSmaisRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smaisRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmaisRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smaisRating")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsaRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsaRating")(js.undefined)
        ret
    }
    @scala.inline
    def withTvpgRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvpgRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvpgRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvpgRating")(js.undefined)
        ret
    }
    @scala.inline
    def withYtRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYtRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytRating")(js.undefined)
        ret
    }
  }
  
}

