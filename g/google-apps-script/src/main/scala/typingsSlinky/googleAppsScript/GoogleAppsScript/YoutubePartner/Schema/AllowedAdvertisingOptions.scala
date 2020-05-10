package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedAdvertisingOptions extends js.Object {
  var adsOnEmbeds: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var licAdFormats: js.UndefOr[js.Array[String]] = js.native
  var ugcAdFormats: js.UndefOr[js.Array[String]] = js.native
}

object AllowedAdvertisingOptions {
  @scala.inline
  def apply(): AllowedAdvertisingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedAdvertisingOptions]
  }
  @scala.inline
  implicit class AllowedAdvertisingOptionsOps[Self <: AllowedAdvertisingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdsOnEmbeds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsOnEmbeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsOnEmbeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsOnEmbeds")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLicAdFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licAdFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicAdFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licAdFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withUgcAdFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ugcAdFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUgcAdFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ugcAdFormats")(js.undefined)
        ret
    }
  }
  
}

