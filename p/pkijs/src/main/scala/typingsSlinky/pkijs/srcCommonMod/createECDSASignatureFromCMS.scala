package typingsSlinky.pkijs.srcCommonMod

import typingsSlinky.asn1js.asn1jsMod.Sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "createECDSASignatureFromCMS")
@js.native
object createECDSASignatureFromCMS extends js.Object {
  /**
    * Create a single ArrayBuffer from CMS ECDSA signature
    * 
    * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
    * @returns {ArrayBuffer}
    */
  def apply(cmsSignature: Sequence): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

