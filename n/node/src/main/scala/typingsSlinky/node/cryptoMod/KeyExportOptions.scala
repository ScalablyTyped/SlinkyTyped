package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.nodeStrings.pkcs1
import typingsSlinky.node.nodeStrings.pkcs8
import typingsSlinky.node.nodeStrings.sec1
import typingsSlinky.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyExportOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
  var `type`: pkcs1 | spki | pkcs8 | sec1
}

object KeyExportOptions {
  @scala.inline
  def apply[/* <: typingsSlinky.node.cryptoMod.KeyFormat */ T](format: T, `type`: pkcs1 | spki | pkcs8 | sec1): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
  @scala.inline
  implicit class KeyExportOptionsOps[Self <: KeyExportOptions[_], /* <: typingsSlinky.node.cryptoMod.KeyFormat */ T] (val x: Self with KeyExportOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: T): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pkcs1 | spki | pkcs8 | sec1): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    @scala.inline
    def setPassphrase(value: String | Buffer): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

