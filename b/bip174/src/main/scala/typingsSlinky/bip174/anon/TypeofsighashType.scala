package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.SighashType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsighashType extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean = js.native
  
  def decode(keyVal: KeyValue): SighashType = js.native
  
  def encode(data: SighashType): KeyValue = js.native
  
  val expected: /* "number" */ String = js.native
}
object TypeofsighashType {
  
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean,
    decode: KeyValue => SighashType,
    encode: SighashType => KeyValue,
    expected: /* "number" */ String
  ): TypeofsighashType = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofsighashType]
  }
  
  @scala.inline
  implicit class TypeofsighashTypeOps[Self <: TypeofsighashType] (val x: Self) extends AnyVal {
    
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
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = this.set("canAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => SighashType): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: SighashType => KeyValue): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: /* "number" */ String): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
}
