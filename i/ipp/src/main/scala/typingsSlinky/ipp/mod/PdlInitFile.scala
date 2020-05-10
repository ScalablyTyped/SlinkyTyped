package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PdlInitFile extends js.Object {
  var `pdl-init-file-entry`: js.UndefOr[String] = js.native
  var `pdl-init-file-location`: js.UndefOr[String] = js.native
  var `pdl-init-file-name`: js.UndefOr[String] = js.native
}

object PdlInitFile {
  @scala.inline
  def apply(): PdlInitFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdlInitFile]
  }
  @scala.inline
  implicit class PdlInitFileOps[Self <: PdlInitFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPdl-init-file-entry`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPdl-init-file-entry`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-entry")(js.undefined)
        ret
    }
    @scala.inline
    def `withPdl-init-file-location`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPdl-init-file-location`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-location")(js.undefined)
        ret
    }
    @scala.inline
    def `withPdl-init-file-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPdl-init-file-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file-name")(js.undefined)
        ret
    }
  }
  
}

