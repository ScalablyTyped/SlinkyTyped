package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CountriesListResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesCollection extends js.Object {
  // Gets one country by ID.
  def get(profileId: String, dartId: String): Country = js.native
  // Retrieves a list of countries.
  def list(profileId: String): CountriesListResponse = js.native
}

object CountriesCollection {
  @scala.inline
  def apply(get: (String, String) => Country, list: String => CountriesListResponse): CountriesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CountriesCollection]
  }
  @scala.inline
  implicit class CountriesCollectionOps[Self <: CountriesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => Country): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => CountriesListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

