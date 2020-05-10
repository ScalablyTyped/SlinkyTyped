package typingsSlinky.cfb.mod

import typingsSlinky.cfb.cfbStrings.array
import typingsSlinky.cfb.cfbStrings.base64
import typingsSlinky.cfb.cfbStrings.binary
import typingsSlinky.cfb.cfbStrings.buffer
import typingsSlinky.cfb.cfbStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBCommonOptions extends js.Object {
  /** If true, throw errors when features are not understood */
  var WTF: js.UndefOr[Boolean] = js.native
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.native
}

object CFBCommonOptions {
  @scala.inline
  def apply(): CFBCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBCommonOptions]
  }
  @scala.inline
  implicit class CFBCommonOptionsOps[Self <: CFBCommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWTF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WTF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWTF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WTF")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: base64 | binary | buffer | file | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

