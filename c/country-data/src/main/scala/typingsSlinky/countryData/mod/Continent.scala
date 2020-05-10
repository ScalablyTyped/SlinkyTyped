package typingsSlinky.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Continent extends js.Object {
  val countries: js.Array[Country] = js.native
  val name: String = js.native
  val regions: js.Array[String] = js.native
}

object Continent {
  @scala.inline
  def apply(countries: js.Array[Country], name: String, regions: js.Array[String]): Continent = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continent]
  }
  @scala.inline
  implicit class ContinentOps[Self <: Continent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountries(value: js.Array[Country]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

