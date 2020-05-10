package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentCopyOptions extends js.Object {
  var overwrite: js.UndefOr[Boolean] = js.native
}

object DocumentCopyOptions {
  @scala.inline
  def apply(): DocumentCopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCopyOptions]
  }
  @scala.inline
  implicit class DocumentCopyOptionsOps[Self <: DocumentCopyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

