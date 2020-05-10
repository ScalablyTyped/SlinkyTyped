package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedDeveloperMetadata extends js.Object {
  /** All filters matching the returned developer metadata. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  /** The developer metadata matching the specified filters. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
}

object MatchedDeveloperMetadata {
  @scala.inline
  def apply(): MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedDeveloperMetadata]
  }
  @scala.inline
  implicit class MatchedDeveloperMetadataOps[Self <: MatchedDeveloperMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[DataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperMetadata(value: DeveloperMetadata): Self = {
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
  }
  
}

