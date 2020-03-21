package typingsSlinky.pkijs

import typingsSlinky.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientCertificate extends js.Object {
  var recipientCertificate: default
  var recipientPrivateKey: scala.scalajs.js.typedarray.ArrayBuffer
}

object AnonRecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: scala.scalajs.js.typedarray.ArrayBuffer): AnonRecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecipientCertificate]
  }
}

