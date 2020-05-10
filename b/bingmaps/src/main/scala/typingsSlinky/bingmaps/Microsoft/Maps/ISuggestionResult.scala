package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionResult extends js.Object {
  /** A structured address object for the result.  */
  var address: IAddress = js.native
  /** A LocationRect that can be used to set the map view over the result. */
  var bestView: LocationRect = js.native
  /** Unique entity id to be used for searching the entity. */
  var entityId: String = js.native
  /** The sub type of result; Address, RoadBlock, PopulatedPlace, CountryRegion, etc. */
  var entitySubType: String = js.native
  /** The type of the result; Address, Place */
  var entityType: String = js.native
  /** A nicely formatted suggestion string for the result based on market. */
  var formattedSuggestion: String = js.native
  /**
    * The coordinate of the result. This value is only returned for place (city, landmarks) results and not for addresses.
    * Street addresses will need to be geocoded to get their location.
    */
  var location: Location = js.native
  /** A secondary title that provides additional context to the title value of the suggestion. **/
  var subtitle: String = js.native
  /** The display title for the result (i.e. “Redmond”). */
  var title: String = js.native
}

object ISuggestionResult {
  @scala.inline
  def apply(
    address: IAddress,
    bestView: LocationRect,
    entityId: String,
    entitySubType: String,
    entityType: String,
    formattedSuggestion: String,
    location: Location,
    subtitle: String,
    title: String
  ): ISuggestionResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], entitySubType = entitySubType.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], formattedSuggestion = formattedSuggestion.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionResult]
  }
  @scala.inline
  implicit class ISuggestionResultOps[Self <: ISuggestionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: IAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestView(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitySubType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitySubType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedSuggestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

