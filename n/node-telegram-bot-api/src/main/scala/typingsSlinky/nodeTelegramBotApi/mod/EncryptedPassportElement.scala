package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedPassportElement extends js.Object {
  var data: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var files: js.UndefOr[js.Array[PassportFile]] = js.native
  var front_side: js.UndefOr[PassportFile] = js.native
  var hash: String = js.native
  var phone_number: js.UndefOr[String] = js.native
  var reverse_side: js.UndefOr[PassportFile] = js.native
  var selfie: js.UndefOr[PassportFile] = js.native
  var translation: js.UndefOr[js.Array[PassportFile]] = js.native
  var `type`: String = js.native
}

object EncryptedPassportElement {
  @scala.inline
  def apply(hash: String, `type`: String): EncryptedPassportElement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPassportElement]
  }
  @scala.inline
  implicit class EncryptedPassportElementOps[Self <: EncryptedPassportElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[PassportFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFront_side(value: PassportFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front_side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront_side: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front_side")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse_side(value: PassportFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse_side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse_side: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse_side")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfie(value: PassportFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfie")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslation(value: js.Array[PassportFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(js.undefined)
        ret
    }
  }
  
}

