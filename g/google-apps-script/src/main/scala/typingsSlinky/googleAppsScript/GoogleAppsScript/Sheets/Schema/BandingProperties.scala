package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandingProperties extends js.Object {
  var firstBandColor: js.UndefOr[Color] = js.native
  var footerColor: js.UndefOr[Color] = js.native
  var headerColor: js.UndefOr[Color] = js.native
  var secondBandColor: js.UndefOr[Color] = js.native
}

object BandingProperties {
  @scala.inline
  def apply(): BandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandingProperties]
  }
  @scala.inline
  implicit class BandingPropertiesOps[Self <: BandingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstBandColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBandColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondBandColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondBandColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColor")(js.undefined)
        ret
    }
  }
  
}

