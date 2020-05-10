package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedTarget extends js.Object {
  /** The country where the items in the feed will be included in the search index, represented as a  CLDR territory code. */
  var country: js.UndefOr[String] = js.native
  /** The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included
    * unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  /** The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for targets[].country. */
  var language: js.UndefOr[String] = js.native
}

object DatafeedTarget {
  @scala.inline
  def apply(): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedTarget]
  }
  @scala.inline
  implicit class DatafeedTargetOps[Self <: DatafeedTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
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
    def withExcludedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

