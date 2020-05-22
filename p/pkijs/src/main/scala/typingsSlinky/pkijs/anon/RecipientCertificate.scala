package typingsSlinky.pkijs.anon

import typingsSlinky.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientCertificate extends js.Object {
  var recipientCertificate: default
  var recipientPrivateKey: js.typedarray.ArrayBuffer
}

object RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: js.typedarray.ArrayBuffer): RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientCertificate]
  }
}

