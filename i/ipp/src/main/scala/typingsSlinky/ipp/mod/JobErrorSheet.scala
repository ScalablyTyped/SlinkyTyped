package typingsSlinky.ipp.mod

import typingsSlinky.ipp.ippStrings.`on-error`
import typingsSlinky.ipp.ippStrings.always
import typingsSlinky.ipp.ippStrings.none
import typingsSlinky.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobErrorSheet extends js.Object {
  var `job-error-sheet-type`: js.UndefOr[none | standard] = js.native
  var `job-error-sheet-when`: js.UndefOr[always | `on-error`] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobErrorSheet {
  @scala.inline
  def apply(): JobErrorSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobErrorSheet]
  }
  @scala.inline
  implicit class JobErrorSheetOps[Self <: JobErrorSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withJob-error-sheet-type`(value: none | standard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-error-sheet-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-error-sheet-when`(value: always | `on-error`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-error-sheet-when`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-when")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-col`(value: MediaInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(js.undefined)
        ret
    }
  }
  
}

