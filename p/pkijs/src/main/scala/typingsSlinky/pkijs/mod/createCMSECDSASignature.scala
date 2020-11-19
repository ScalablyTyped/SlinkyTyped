package typingsSlinky.pkijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/common", "createCMSECDSASignature")
@js.native
object createCMSECDSASignature extends js.Object {
  
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    *
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  def apply(signatureBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = js.native
}
