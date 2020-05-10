package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datafeed extends js.Object {
  /** The two-letter ISO 639-1 language in which the attributes are defined in the data feed. */
  var attributeLanguage: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] Please use target.language instead. The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for
    * targetCountry.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /** The type of data feed. For product inventory feeds, only feeds for local stores, not online stores, are supported. */
  var contentType: js.UndefOr[String] = js.native
  /** Fetch schedule for the feed file. */
  var fetchSchedule: js.UndefOr[DatafeedFetchSchedule] = js.native
  /** The filename of the feed. All feeds must have a unique file name. */
  var fileName: js.UndefOr[String] = js.native
  /** Format of the feed file. */
  var format: js.UndefOr[DatafeedFormat] = js.native
  /** The ID of the data feed. */
  var id: js.UndefOr[String] = js.native
  /** [DEPRECATED] Please use target.includedDestination instead. The list of intended destinations (corresponds to checked check boxes in Merchant Center). */
  var intendedDestinations: js.UndefOr[js.Array[String]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeed". */
  var kind: js.UndefOr[String] = js.native
  /** A descriptive name of the data feed. */
  var name: js.UndefOr[String] = js.native
  /**
    * [DEPRECATED] Please use target.country instead. The country where the items in the feed will be included in the search index, represented as a CLDR
    * territory code.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /** The targets this feed should apply to (country, language, destinations). */
  var targets: js.UndefOr[js.Array[DatafeedTarget]] = js.native
}

object Datafeed {
  @scala.inline
  def apply(): Datafeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datafeed]
  }
  @scala.inline
  implicit class DatafeedOps[Self <: Datafeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchSchedule(value: DatafeedFetchSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: DatafeedFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIntendedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intendedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntendedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intendedDestinations")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[DatafeedTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

