package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSheetsInterface extends js.Object {
  var `job-sheets`: js.UndefOr[JobSheets] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}

object JobSheetsInterface {
  @scala.inline
  def apply(): JobSheetsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSheetsInterface]
  }
  @scala.inline
  implicit class JobSheetsInterfaceOps[Self <: JobSheetsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withJob-sheets`(value: JobSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets")(js.undefined)
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

