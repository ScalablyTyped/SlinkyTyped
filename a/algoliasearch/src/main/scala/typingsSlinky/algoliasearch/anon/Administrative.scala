package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliasearch.mod.Places.highlightResultValueInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Administrative extends js.Object {
  var administrative: highlightResultValueInterface = js.native
  var country: highlightResultValueInterface = js.native
  var county: js.UndefOr[highlightResultValueInterface] = js.native
  var locale_names: js.Array[highlightResultValueInterface] = js.native
  var postcode: js.Array[highlightResultValueInterface] = js.native
}

object Administrative {
  @scala.inline
  def apply(
    administrative: highlightResultValueInterface,
    country: highlightResultValueInterface,
    locale_names: js.Array[highlightResultValueInterface],
    postcode: js.Array[highlightResultValueInterface]
  ): Administrative = {
    val __obj = js.Dynamic.literal(administrative = administrative.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Administrative]
  }
  @scala.inline
  implicit class AdministrativeOps[Self <: Administrative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrative(value: highlightResultValueInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: highlightResultValueInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale_names(value: js.Array[highlightResultValueInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: js.Array[highlightResultValueInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounty(value: highlightResultValueInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(js.undefined)
        ret
    }
  }
  
}

