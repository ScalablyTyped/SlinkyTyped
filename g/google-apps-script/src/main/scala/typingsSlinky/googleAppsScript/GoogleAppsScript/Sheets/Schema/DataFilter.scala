package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFilter extends js.Object {
  var a1Range: js.UndefOr[String] = js.native
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.native
  var gridRange: js.UndefOr[GridRange] = js.native
}

object DataFilter {
  @scala.inline
  def apply(): DataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilter]
  }
  @scala.inline
  implicit class DataFilterOps[Self <: DataFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA1Range(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a1Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA1Range: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a1Range")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperMetadataLookup(value: DeveloperMetadataLookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadataLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadataLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadataLookup")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRange")(js.undefined)
        ret
    }
  }
  
}

