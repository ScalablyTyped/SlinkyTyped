package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionProperties extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  var hiddenByFilter: js.UndefOr[Boolean] = js.native
  var hiddenByUser: js.UndefOr[Boolean] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
}

object DimensionProperties {
  @scala.inline
  def apply(): DimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionProperties]
  }
  @scala.inline
  implicit class DimensionPropertiesOps[Self <: DimensionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenByFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenByFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenByUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenByUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByUser")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
  }
  
}

