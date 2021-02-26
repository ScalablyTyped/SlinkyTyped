package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofunsignedTx extends StObject {
  
  def encode(data: Transaction): KeyValue = js.native
}
object TypeofunsignedTx {
  
  @scala.inline
  def apply(encode: Transaction => KeyValue): TypeofunsignedTx = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[TypeofunsignedTx]
  }
  
  @scala.inline
  implicit class TypeofunsignedTxMutableBuilder[Self <: TypeofunsignedTx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: Transaction => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
