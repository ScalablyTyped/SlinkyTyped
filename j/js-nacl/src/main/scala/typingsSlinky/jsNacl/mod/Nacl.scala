package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nacl extends js.Object {
  def crypto_box(
    msg: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    rcpt: js.typedarray.Uint8Array,
    sender: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array
  // crypto_box
  def crypto_box_keypair(): BoxKeyPair
  def crypto_box_keypair_from_raw_sk(seed: js.typedarray.Uint8Array): BoxKeyPair
  def crypto_box_open(
    cipher: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sender: js.typedarray.Uint8Array,
    rcpt: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array
  def crypto_box_open_precomputed(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array
  def crypto_box_precompute(sender: js.typedarray.Uint8Array, rcpt: js.typedarray.Uint8Array): BoxSharedSecret
  def crypto_box_precomputed(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, shared: BoxSharedSecret): js.typedarray.Uint8Array
  def crypto_box_random_nonce(): js.typedarray.Uint8Array
  def crypto_box_seed_keypair(seed: js.typedarray.Uint8Array): BoxKeyPair
  // hash
  def crypto_hash(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  def crypto_hash_sha256(raw: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  def crypto_secretbox(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  def crypto_secretbox_open(cipher: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  // crypto_secretbox
  def crypto_secretbox_random_nonce(): js.typedarray.Uint8Array
  def crypto_sign(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  def crypto_sign_detached(msg: js.typedarray.Uint8Array, sk: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  // crypto_sign
  def crypto_sign_keypair(): SignKeyPair
  def crypto_sign_open(packet: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null
  // derived keys
  def crypto_sign_seed_keypair(seed: js.typedarray.Uint8Array): SignKeyPair
  def crypto_sign_verify_detached(sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array, pk: js.typedarray.Uint8Array): Boolean
  def decode_latin1(arr: js.typedarray.Uint8Array): String
  def decode_utf8(arr: js.typedarray.Uint8Array): String
  def encode_latin1(latin1: String): js.typedarray.Uint8Array
  def encode_utf8(utf8: String): js.typedarray.Uint8Array
  def from_hex(hex: String): js.typedarray.Uint8Array
  // random
  def random_bytes(length: Double): js.typedarray.Uint8Array
  // strings vs. binary
  def to_hex(arr: js.typedarray.Uint8Array): String
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
}

