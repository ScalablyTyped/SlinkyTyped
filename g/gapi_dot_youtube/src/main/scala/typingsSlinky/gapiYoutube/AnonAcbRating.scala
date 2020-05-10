package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcbRating extends js.Object {
  /**
    * The videos Australian Classification Board (ACB) rating.
    */
  var acbRating: String = js.native
  /**
    * The videos British Board of Film Classification (BBFC) rating.
    */
  var bbfcRating: String = js.native
  /**
    * The videos Central Board of Film Certification (CBFC - India) rating.
    */
  var cbfcRating: String = js.native
  /**
    * The videos Canadian Home Video Rating System (CHVRS) rating.
    */
  var chvrsRating: String = js.native
  /**
    * The videos Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.
    */
  var djctqRating: String = js.native
  /**
    * The videos Eirin rating. Eirin is the Japanese rating system.
    */
  var eirinRating: String = js.native
  /**
    * The videos Centre national du cinéma et de limage animé (French Ministry of Culture) rating.
    */
  var fmocRating: String = js.native
  /**
    * The videos Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.
    */
  var fskRating: String = js.native
  /**
    * The videos Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.
    */
  var icaaRating: String = js.native
  /**
    * The videos Korea Media Rating Board rating. The KMRB rates videos in South Korea.
    */
  var kmrbRating: String = js.native
  /**
    * The videos Motion Picture Association of America (MPAA) rating.
    */
  var mpaaRating: String = js.native
  /**
    * The videos Office of Film and Literature Classification (OFLC - New Zealand) rating.
    */
  var oflcRating: String = js.native
  /**
    * The videos General Directorate of Radio, Television and Cinematography (Mexico) rating.
    */
  var rtcRating: String = js.native
  /**
    * The videos National Film Registry of the Russian Federation (MKRF - Russia) rating.
    */
  var russiaRating: String = js.native
  /**
    * The videos TV Parental Guidelines (TVPG) rating.
    */
  var tvpgRating: String = js.native
}

object AnonAcbRating {
  @scala.inline
  def apply(
    acbRating: String,
    bbfcRating: String,
    cbfcRating: String,
    chvrsRating: String,
    djctqRating: String,
    eirinRating: String,
    fmocRating: String,
    fskRating: String,
    icaaRating: String,
    kmrbRating: String,
    mpaaRating: String,
    oflcRating: String,
    rtcRating: String,
    russiaRating: String,
    tvpgRating: String
  ): AnonAcbRating = {
    val __obj = js.Dynamic.literal(acbRating = acbRating.asInstanceOf[js.Any], bbfcRating = bbfcRating.asInstanceOf[js.Any], cbfcRating = cbfcRating.asInstanceOf[js.Any], chvrsRating = chvrsRating.asInstanceOf[js.Any], djctqRating = djctqRating.asInstanceOf[js.Any], eirinRating = eirinRating.asInstanceOf[js.Any], fmocRating = fmocRating.asInstanceOf[js.Any], fskRating = fskRating.asInstanceOf[js.Any], icaaRating = icaaRating.asInstanceOf[js.Any], kmrbRating = kmrbRating.asInstanceOf[js.Any], mpaaRating = mpaaRating.asInstanceOf[js.Any], oflcRating = oflcRating.asInstanceOf[js.Any], rtcRating = rtcRating.asInstanceOf[js.Any], russiaRating = russiaRating.asInstanceOf[js.Any], tvpgRating = tvpgRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcbRating]
  }
  @scala.inline
  implicit class AnonAcbRatingOps[Self <: AnonAcbRating] (val x: Self) extends AnyVal {
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
    def withBbfcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbfcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCbfcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbfcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChvrsRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chvrsRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDjctqRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djctqRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEirinRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eirinRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFmocRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmocRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFskRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fskRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmrbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmrbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpaaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpaaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOflcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oflcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtcRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRussiaRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("russiaRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTvpgRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvpgRating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

