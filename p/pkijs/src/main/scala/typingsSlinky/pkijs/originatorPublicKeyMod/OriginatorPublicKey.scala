package typingsSlinky.pkijs.originatorPublicKeyMod

import typingsSlinky.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginatorPublicKey extends js.Object {
  
  var algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var publicKey: BitString = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object OriginatorPublicKey {
  
  @scala.inline
  def apply(
    algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    publicKey: BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OriginatorPublicKey]
  }
  
  @scala.inline
  implicit class OriginatorPublicKeyOps[Self <: OriginatorPublicKey] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublicKey(value: BitString): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
