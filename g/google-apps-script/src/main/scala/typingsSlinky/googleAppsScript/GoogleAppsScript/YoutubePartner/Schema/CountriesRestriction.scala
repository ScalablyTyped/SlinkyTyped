package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesRestriction extends js.Object {
  var adFormats: js.UndefOr[js.Array[String]] = js.native
  var territories: js.UndefOr[js.Array[String]] = js.native
}

object CountriesRestriction {
  @scala.inline
  def apply(): CountriesRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountriesRestriction]
  }
  @scala.inline
  implicit class CountriesRestrictionOps[Self <: CountriesRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withTerritories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("territories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerritories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("territories")(js.undefined)
        ret
    }
  }
  
}

