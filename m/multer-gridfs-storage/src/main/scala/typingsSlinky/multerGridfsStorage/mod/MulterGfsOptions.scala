package typingsSlinky.multerGridfsStorage.mod

import org.scalajs.dom.experimental.Request
import typingsSlinky.multerGridfsStorage.mod.global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulterGfsOptions extends js.Object {
  var file: js.UndefOr[js.Function2[/* req */ Request, /* file */ File, _]] = js.native
}

object MulterGfsOptions {
  @scala.inline
  def apply(): MulterGfsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulterGfsOptions]
  }
  @scala.inline
  implicit class MulterGfsOptionsOps[Self <: MulterGfsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: (/* req */ Request, /* file */ File) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
  }
  
}

