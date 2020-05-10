package typingsSlinky.ipp.mod

import typingsSlinky.ipp.ippStrings.none
import typingsSlinky.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobAccontingSheets extends js.Object {
  var `job-accounting-output-bin`: js.UndefOr[OutputBin] = js.native
  var `job-accounting-sheets-type`: js.UndefOr[none | standard] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobAccontingSheets {
  @scala.inline
  def apply(): JobAccontingSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobAccontingSheets]
  }
  @scala.inline
  implicit class JobAccontingSheetsOps[Self <: JobAccontingSheets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withJob-accounting-output-bin`(value: OutputBin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-output-bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-output-bin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-output-bin")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-accounting-sheets-type`(value: none | standard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-sheets-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets-type")(js.undefined)
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

