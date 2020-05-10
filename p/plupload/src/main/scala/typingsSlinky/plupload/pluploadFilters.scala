package typingsSlinky.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadFilters extends js.Object {
  var max_file_size: js.UndefOr[Double | String] = js.native
  var mime_types: js.UndefOr[js.Array[pluploadFiltersMimeTypes]] = js.native
  var prevent_duplicates: js.UndefOr[Boolean] = js.native
}

object pluploadFilters {
  @scala.inline
  def apply(): pluploadFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadFilters]
  }
  @scala.inline
  implicit class pluploadFiltersOps[Self <: pluploadFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_file_size(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_file_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_file_size")(js.undefined)
        ret
    }
    @scala.inline
    def withMime_types(value: js.Array[pluploadFiltersMimeTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_types")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevent_duplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevent_duplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_duplicates")(js.undefined)
        ret
    }
  }
  
}

