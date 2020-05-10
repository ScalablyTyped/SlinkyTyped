package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.googima
import typingsSlinky.jwplayer.jwplayerStrings.mid
import typingsSlinky.jwplayer.jwplayerStrings.post
import typingsSlinky.jwplayer.jwplayerStrings.pre
import typingsSlinky.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdImpressionParam extends js.Object {
  var adposition: pre | mid | post = js.native
  var adsystem: String = js.native
  var adtitle: String = js.native
  var clickThroughUrl: String = js.native
  var client: vast | googima = js.native
  var creativetype: String = js.native
  var linear: String = js.native
  var mediafile: js.Any = js.native
  var tag: String = js.native
  var vastversion: Double = js.native
  var wrapper: js.Array[_] = js.native
}

object AdImpressionParam {
  @scala.inline
  def apply(
    adposition: pre | mid | post,
    adsystem: String,
    adtitle: String,
    clickThroughUrl: String,
    client: vast | googima,
    creativetype: String,
    linear: String,
    mediafile: js.Any,
    tag: String,
    vastversion: Double,
    wrapper: js.Array[_]
  ): AdImpressionParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem.asInstanceOf[js.Any], adtitle = adtitle.asInstanceOf[js.Any], clickThroughUrl = clickThroughUrl.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], mediafile = mediafile.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vastversion = vastversion.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdImpressionParam]
  }
  @scala.inline
  implicit class AdImpressionParamOps[Self <: AdImpressionParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdposition(value: pre | mid | post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdsystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickThroughUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: vast | googima): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreativetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediafile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediafile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVastversion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vastversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

