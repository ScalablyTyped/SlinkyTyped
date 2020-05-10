package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nacl extends js.Object {
  def crypto_box(
    msg: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    rcpt: js.typedarray.Uint8Array,
    sender: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  // crypto_box
  def crypto_box_keypair(): BoxKeyPair = js.native
  def crypto_box_keypair_from_raw_sk(seed: js.typedarray.Uint8Array): BoxKeyPair = js.native
  def crypto_box_open(
    cipher: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sender: js.typedarray.Uint8Array,
    rcpt: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def crypto_box_open_precomputed(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array = js.native
  def crypto_box_precompute(sender: js.typedarray.Uint8Array, rcpt: js.typedarray.Uint8Array): BoxSharedSecret = js.native
  def crypto_box_precomputed(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array = js.native
  def crypto_box_random_nonce(): js.typedarray.Uint8Array = js.native
  def crypto_box_seed_keypair(seed: js.typedarray.Uint8Array): BoxKeyPair = js.native
  // hash
  def crypto_hash(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def crypto_hash_sha256(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def crypto_secretbox(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def crypto_secretbox_open(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  // crypto_secretbox
  def crypto_secretbox_random_nonce(): js.typedarray.Uint8Array = js.native
  def crypto_sign(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def crypto_sign_detached(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  // crypto_sign
  def crypto_sign_keypair(): SignKeyPair = js.native
  def crypto_sign_open(packet: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
  // derived keys
  def crypto_sign_seed_keypair(seed: js.typedarray.Uint8Array): SignKeyPair = js.native
  def crypto_sign_verify_detached(sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): Boolean = js.native
  def decode_latin1(arr: js.typedarray.Uint8Array): String = js.native
  def decode_utf8(arr: js.typedarray.Uint8Array): String = js.native
  def encode_latin1(latin1: String): js.typedarray.Uint8Array = js.native
  def encode_utf8(utf8: String): js.typedarray.Uint8Array = js.native
  def from_hex(hex: String): js.typedarray.Uint8Array = js.native
  // random
  def random_bytes(length: Double): js.typedarray.Uint8Array = js.native
  // strings vs. binary
  def to_hex(arr: js.typedarray.Uint8Array): String = js.native
}

object Nacl {
  @scala.inline
  def apply(
    crypto_box: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_box_keypair: () => BoxKeyPair,
    crypto_box_keypair_from_raw_sk: js.typedarray.Uint8Array => BoxKeyPair,
    crypto_box_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_box_open_precomputed: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array,
    crypto_box_precompute: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => BoxSharedSecret,
    crypto_box_precomputed: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array,
    crypto_box_random_nonce: () => js.typedarray.Uint8Array,
    crypto_box_seed_keypair: js.typedarray.Uint8Array => BoxKeyPair,
    crypto_hash: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
    crypto_hash_sha256: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
    crypto_secretbox: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_secretbox_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_secretbox_random_nonce: () => js.typedarray.Uint8Array,
    crypto_sign: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_sign_detached: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    crypto_sign_keypair: () => SignKeyPair,
    crypto_sign_open: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null,
    crypto_sign_seed_keypair: js.typedarray.Uint8Array => SignKeyPair,
    crypto_sign_verify_detached: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean,
    decode_latin1: js.typedarray.Uint8Array => String,
    decode_utf8: js.typedarray.Uint8Array => String,
    encode_latin1: String => js.typedarray.Uint8Array,
    encode_utf8: String => js.typedarray.Uint8Array,
    from_hex: String => js.typedarray.Uint8Array,
    random_bytes: Double => js.typedarray.Uint8Array,
    to_hex: js.typedarray.Uint8Array => String
  ): Nacl = {
    val __obj = js.Dynamic.literal(crypto_box = js.Any.fromFunction4(crypto_box), crypto_box_keypair = js.Any.fromFunction0(crypto_box_keypair), crypto_box_keypair_from_raw_sk = js.Any.fromFunction1(crypto_box_keypair_from_raw_sk), crypto_box_open = js.Any.fromFunction4(crypto_box_open), crypto_box_open_precomputed = js.Any.fromFunction3(crypto_box_open_precomputed), crypto_box_precompute = js.Any.fromFunction2(crypto_box_precompute), crypto_box_precomputed = js.Any.fromFunction3(crypto_box_precomputed), crypto_box_random_nonce = js.Any.fromFunction0(crypto_box_random_nonce), crypto_box_seed_keypair = js.Any.fromFunction1(crypto_box_seed_keypair), crypto_hash = js.Any.fromFunction1(crypto_hash), crypto_hash_sha256 = js.Any.fromFunction1(crypto_hash_sha256), crypto_secretbox = js.Any.fromFunction3(crypto_secretbox), crypto_secretbox_open = js.Any.fromFunction3(crypto_secretbox_open), crypto_secretbox_random_nonce = js.Any.fromFunction0(crypto_secretbox_random_nonce), crypto_sign = js.Any.fromFunction2(crypto_sign), crypto_sign_detached = js.Any.fromFunction2(crypto_sign_detached), crypto_sign_keypair = js.Any.fromFunction0(crypto_sign_keypair), crypto_sign_open = js.Any.fromFunction2(crypto_sign_open), crypto_sign_seed_keypair = js.Any.fromFunction1(crypto_sign_seed_keypair), crypto_sign_verify_detached = js.Any.fromFunction3(crypto_sign_verify_detached), decode_latin1 = js.Any.fromFunction1(decode_latin1), decode_utf8 = js.Any.fromFunction1(decode_utf8), encode_latin1 = js.Any.fromFunction1(encode_latin1), encode_utf8 = js.Any.fromFunction1(encode_utf8), from_hex = js.Any.fromFunction1(from_hex), random_bytes = js.Any.fromFunction1(random_bytes), to_hex = js.Any.fromFunction1(to_hex))
    __obj.asInstanceOf[Nacl]
  }
  @scala.inline
  implicit class NaclOps[Self <: Nacl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrypto_box(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCrypto_box_keypair(value: () => BoxKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_keypair")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCrypto_box_keypair_from_raw_sk(value: js.typedarray.Uint8Array => BoxKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_keypair_from_raw_sk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCrypto_box_open(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_open")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCrypto_box_open_precomputed(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_open_precomputed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCrypto_box_precompute(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => BoxSharedSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_precompute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrypto_box_precomputed(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, BoxSharedSecret) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_precomputed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCrypto_box_random_nonce(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_random_nonce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCrypto_box_seed_keypair(value: js.typedarray.Uint8Array => BoxKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_box_seed_keypair")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCrypto_hash(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_hash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCrypto_hash_sha256(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_hash_sha256")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCrypto_secretbox(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_secretbox")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCrypto_secretbox_open(
      value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_secretbox_open")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCrypto_secretbox_random_nonce(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_secretbox_random_nonce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCrypto_sign(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrypto_sign_detached(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign_detached")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrypto_sign_keypair(value: () => SignKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign_keypair")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCrypto_sign_open(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign_open")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrypto_sign_seed_keypair(value: js.typedarray.Uint8Array => SignKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign_seed_keypair")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCrypto_sign_verify_detached(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto_sign_verify_detached")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDecode_latin1(value: js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode_latin1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecode_utf8(value: js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode_utf8")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode_latin1(value: String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode_latin1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode_utf8(value: String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode_utf8")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrom_hex(value: String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_hex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRandom_bytes(value: Double => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_bytes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo_hex(value: js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_hex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

