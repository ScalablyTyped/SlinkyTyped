package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.Bip32Derivation
import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanAddToArray extends js.Object {
  var expected: String = js.native
  def canAddToArray(array: js.Array[Bip32Derivation], item: Bip32Derivation, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean = js.native
  def decode(keyVal: KeyValue): Bip32Derivation = js.native
  def encode(data: Bip32Derivation): KeyValue = js.native
}

object CanAddToArray {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean,
    decode: KeyValue => Bip32Derivation,
    encode: Bip32Derivation => KeyValue,
    expected: String
  ): CanAddToArray = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddToArray]
  }
  @scala.inline
  implicit class CanAddToArrayOps[Self <: CanAddToArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanAddToArray(value: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddToArray")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecode(value: KeyValue => Bip32Derivation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: Bip32Derivation => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

