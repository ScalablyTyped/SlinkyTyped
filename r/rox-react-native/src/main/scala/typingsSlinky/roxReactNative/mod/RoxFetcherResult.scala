package typingsSlinky.roxReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoxFetcherResult extends js.Object {
  var creationDate: js.Date = js.native
  var errorDetails: js.UndefOr[String] = js.native
  var fetcherStatus: RoxFetcherStatus = js.native
  var hasChanges: Boolean = js.native
}

object RoxFetcherResult {
  @scala.inline
  def apply(creationDate: js.Date, fetcherStatus: RoxFetcherStatus, hasChanges: Boolean): RoxFetcherResult = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxFetcherResult]
  }
  @scala.inline
  implicit class RoxFetcherResultOps[Self <: RoxFetcherResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetcherStatus(value: RoxFetcherStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetcherStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(js.undefined)
        ret
    }
  }
  
}

