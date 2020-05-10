package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadata extends js.Object {
  var location: js.UndefOr[DeveloperMetadataLocation] = js.native
  var metadataId: js.UndefOr[Double] = js.native
  var metadataKey: js.UndefOr[String] = js.native
  var metadataValue: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object DeveloperMetadata {
  @scala.inline
  def apply(): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadata]
  }
  @scala.inline
  implicit class DeveloperMetadataOps[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: DeveloperMetadataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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

