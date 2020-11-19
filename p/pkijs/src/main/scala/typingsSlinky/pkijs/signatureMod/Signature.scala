package typingsSlinky.pkijs.signatureMod

import typingsSlinky.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends js.Object {
  
  var certs: js.UndefOr[js.Array[typingsSlinky.pkijs.certificateMod.default]] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var signature: BitString = js.native
  
  var signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object Signature {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    signature: BitString,
    signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): Signature = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit class SignatureOps[Self <: Signature] (val x: Self) extends AnyVal {
    
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignature(value: BitString): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCertsVarargs(value: typingsSlinky.pkijs.certificateMod.default*): Self = this.set("certs", js.Array(value :_*))
    
    @scala.inline
    def setCerts(value: js.Array[typingsSlinky.pkijs.certificateMod.default]): Self = this.set("certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCerts: Self = this.set("certs", js.undefined)
  }
}
