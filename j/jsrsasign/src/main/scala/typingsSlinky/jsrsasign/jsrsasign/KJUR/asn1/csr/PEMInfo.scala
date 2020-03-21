package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.csr

import typingsSlinky.jsrsasign.AnonHexName
import typingsSlinky.jsrsasign.AnonObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEMInfo extends js.Object {
  var pubkey: AnonObj
  var subject: AnonHexName
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: AnonObj, subject: AnonHexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PEMInfo]
  }
}

