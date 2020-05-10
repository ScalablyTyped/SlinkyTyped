package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientFileWriteOptions extends js.Object {
  var lastVersionTag: js.UndefOr[String] = js.native
  var noOverwrite: js.UndefOr[Boolean] = js.native
  var parentRev: js.UndefOr[String] = js.native
}

object ClientFileWriteOptions {
  @scala.inline
  def apply(): ClientFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileWriteOptions]
  }
  @scala.inline
  implicit class ClientFileWriteOptionsOps[Self <: ClientFileWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastVersionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastVersionTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionTag")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOverwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOverwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withParentRev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRev")(js.undefined)
        ret
    }
  }
  
}

