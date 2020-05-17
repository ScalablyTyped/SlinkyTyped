package typingsSlinky.firebaseStorage.anon

import typingsSlinky.firebaseStorageTypes.mod.StringFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BASE64 extends js.Object {
  var BASE64: StringFormat = js.native
  var BASE64URL: StringFormat = js.native
  var DATA_URL: StringFormat = js.native
  var RAW: StringFormat = js.native
}

object BASE64 {
  @scala.inline
  def apply(BASE64: StringFormat, BASE64URL: StringFormat, DATA_URL: StringFormat, RAW: StringFormat): BASE64 = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DATA_URL = DATA_URL.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BASE64]
  }
  @scala.inline
  implicit class BASE64Ops[Self <: BASE64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBASE64(value: StringFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBASE64URL(value: StringFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATA_URL(value: StringFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRAW(value: StringFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

