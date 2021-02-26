package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.GlobalXpub
import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofglobalXpub extends StObject {
  
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = js.native
  
  def decode(keyVal: KeyValue): GlobalXpub = js.native
  
  def encode(data: GlobalXpub): KeyValue = js.native
  
  val expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String = js.native
}
object TypeofglobalXpub {
  
  @scala.inline
  def apply(
    canAddToArray: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean,
    decode: KeyValue => GlobalXpub,
    encode: GlobalXpub => KeyValue,
    expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String
  ): TypeofglobalXpub = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofglobalXpub]
  }
  
  @scala.inline
  implicit class TypeofglobalXpubMutableBuilder[Self <: TypeofglobalXpub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAddToArray(value: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean): Self = StObject.set(x, "canAddToArray", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: KeyValue => GlobalXpub): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: GlobalXpub => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpected(value: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
