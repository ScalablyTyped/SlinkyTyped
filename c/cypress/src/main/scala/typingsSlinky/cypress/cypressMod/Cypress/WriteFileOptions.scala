package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to change the default behavior of .writeFile */
@js.native
trait WriteFileOptions extends Loggable {
  var encoding: Encodings = js.native
  var flag: String = js.native
}

object WriteFileOptions {
  @scala.inline
  def apply(encoding: Encodings, flag: String, log: Boolean): WriteFileOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileOptions]
  }
  @scala.inline
  implicit class WriteFileOptionsOps[Self <: WriteFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: Encodings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

