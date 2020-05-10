package typingsSlinky.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lib {
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = typingsSlinky.cryptojs.CryptoJS.lib.IStreamCipher[typingsSlinky.cryptojs.CryptoJS.lib.IBlockCipherCfg]
  type Cipher = typingsSlinky.cryptojs.CryptoJS.lib.ICipher[js.Object]
  type CipherHelper = typingsSlinky.cryptojs.CryptoJS.lib.ICipherHelper[js.Object]
  type Hasher = typingsSlinky.cryptojs.CryptoJS.lib.IHasher[js.Object]
  type HasherHelper = typingsSlinky.cryptojs.CryptoJS.lib.IHasherHelper[js.Object]
  type PasswordBasedCipher = typingsSlinky.cryptojs.CryptoJS.lib.IPasswordBasedCipher[typingsSlinky.cryptojs.CryptoJS.lib.IPasswordBasedCipherCfg]
  type SerializableCipher = typingsSlinky.cryptojs.CryptoJS.lib.ISerializableCipher[typingsSlinky.cryptojs.CryptoJS.lib.ISerializableCipherCfg]
  type SomeArray = js.typedarray.ArrayBuffer | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array
  type StreamCipher = typingsSlinky.cryptojs.CryptoJS.lib.IStreamCipher[js.Object]
}
