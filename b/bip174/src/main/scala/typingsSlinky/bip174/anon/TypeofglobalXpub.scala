package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.GlobalXpub
import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofglobalXpub extends js.Object {
  val expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String = js.native
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = js.native
  def decode(keyVal: KeyValue): GlobalXpub = js.native
  def encode(data: GlobalXpub): KeyValue = js.native
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
  implicit class TypeofglobalXpubOps[Self <: TypeofglobalXpub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanAddToArray(value: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddToArray")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecode(value: KeyValue => GlobalXpub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: GlobalXpub => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpected(value: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

