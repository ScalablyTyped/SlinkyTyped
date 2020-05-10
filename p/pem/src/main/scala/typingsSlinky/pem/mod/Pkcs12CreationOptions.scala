package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pkcs12CreationOptions extends js.Object {
  var certFiles: js.UndefOr[js.Array[String]] = js.native
  var cipher: js.UndefOr[PrivateKeyCipher] = js.native
  var clientKeyPassword: js.UndefOr[String] = js.native
}

object Pkcs12CreationOptions {
  @scala.inline
  def apply(): Pkcs12CreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkcs12CreationOptions]
  }
  @scala.inline
  implicit class Pkcs12CreationOptionsOps[Self <: Pkcs12CreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withCipher(value: PrivateKeyCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCipher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(js.undefined)
        ret
    }
    @scala.inline
    def withClientKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKeyPassword")(js.undefined)
        ret
    }
  }
  
}

