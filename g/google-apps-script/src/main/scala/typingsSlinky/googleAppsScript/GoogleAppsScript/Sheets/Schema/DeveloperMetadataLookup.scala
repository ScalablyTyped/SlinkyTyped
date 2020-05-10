package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadataLookup extends js.Object {
  var locationMatchingStrategy: js.UndefOr[String] = js.native
  var locationType: js.UndefOr[String] = js.native
  var metadataId: js.UndefOr[Double] = js.native
  var metadataKey: js.UndefOr[String] = js.native
  var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.native
  var metadataValue: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object DeveloperMetadataLookup {
  @scala.inline
  def apply(): DeveloperMetadataLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadataLookup]
  }
  @scala.inline
  implicit class DeveloperMetadataLookupOps[Self <: DeveloperMetadataLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationMatchingStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMatchingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMatchingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMatchingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataId")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataLocation(value: DeveloperMetadataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

