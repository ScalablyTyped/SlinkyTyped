package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSaveDisposition extends js.Object {
  var `save-disposition`: js.UndefOr[SaveDisposition] = js.native
  var `save-info`: js.UndefOr[js.Array[SaveInfo]] = js.native
}

object JobSaveDisposition {
  @scala.inline
  def apply(): JobSaveDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSaveDisposition]
  }
  @scala.inline
  implicit class JobSaveDispositionOps[Self <: JobSaveDisposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withSave-disposition`(value: SaveDisposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-disposition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-disposition")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-info`(value: js.Array[SaveInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-info")(js.undefined)
        ret
    }
  }
  
}

