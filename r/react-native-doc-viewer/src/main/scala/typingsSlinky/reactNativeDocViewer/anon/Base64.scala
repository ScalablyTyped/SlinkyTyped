package typingsSlinky.reactNativeDocViewer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64 extends js.Object {
  var base64: String = js.native
  var fileName: js.UndefOr[String] = js.native
  var fileType: js.UndefOr[String] = js.native
}

object Base64 {
  @scala.inline
  def apply(base64: String): Base64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64]
  }
  @scala.inline
  implicit class Base64Ops[Self <: Base64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
  }
  
}

