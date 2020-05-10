package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparatorSheets extends js.Object {
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  var `separator-sheets-type`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.native
}

object SeparatorSheets {
  @scala.inline
  def apply(): SeparatorSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorSheets]
  }
  @scala.inline
  implicit class SeparatorSheetsOps[Self <: SeparatorSheets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def `withSeparator-sheets-type`(value: js.Array[SeparatorSheetsType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSeparator-sheets-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets-type")(js.undefined)
        ret
    }
  }
  
}

