package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveInfo extends js.Object {
  var `save-document-format`: js.UndefOr[MimeMediaType] = js.native
  var `save-location`: js.UndefOr[String] = js.native
  var `save-name`: js.UndefOr[String] = js.native
}

object SaveInfo {
  @scala.inline
  def apply(): SaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveInfo]
  }
  @scala.inline
  implicit class SaveInfoOps[Self <: SaveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withSave-document-format`(value: MimeMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-document-format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-document-format`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-document-format")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-location`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-location`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-location")(js.undefined)
        ret
    }
    @scala.inline
    def `withSave-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSave-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save-name")(js.undefined)
        ret
    }
  }
  
}

