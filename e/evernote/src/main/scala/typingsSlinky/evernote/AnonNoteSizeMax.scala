package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoteSizeMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  var noteSizeMax: js.UndefOr[Double] = js.native
  var resourceSizeMax: js.UndefOr[Double] = js.native
  var uploadLimit: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
}

object AnonNoteSizeMax {
  @scala.inline
  def apply(): AnonNoteSizeMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoteSizeMax]
  }
  @scala.inline
  implicit class AnonNoteSizeMaxOps[Self <: AnonNoteSizeMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoteResourceCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteResourceCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteResourceCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteResourceCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteSizeMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteSizeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteSizeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteSizeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceSizeMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceSizeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceSizeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceSizeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploaded")(js.undefined)
        ret
    }
  }
  
}

