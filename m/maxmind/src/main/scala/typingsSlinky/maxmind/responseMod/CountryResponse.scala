package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryResponse extends Response {
  val continent: js.UndefOr[ContinentRecord] = js.native
  val country: js.UndefOr[CountryRecord] = js.native
  val registered_country: js.UndefOr[RegisteredCountryRecord] = js.native
  val represented_country: js.UndefOr[RepresentedCountryRecord] = js.native
  val traits: js.UndefOr[TraitsRecord] = js.native
}

object CountryResponse {
  @scala.inline
  def apply(): CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryResponse]
  }
  @scala.inline
  implicit class CountryResponseOps[Self <: CountryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinent(value: ContinentRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: CountryRecord): Self = {
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
    def withRegistered_country(value: RegisteredCountryRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistered_country: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered_country")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresented_country(value: RepresentedCountryRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("represented_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresented_country: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("represented_country")(js.undefined)
        ret
    }
    @scala.inline
    def withTraits(value: TraitsRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traits")(js.undefined)
        ret
    }
  }
  
}

