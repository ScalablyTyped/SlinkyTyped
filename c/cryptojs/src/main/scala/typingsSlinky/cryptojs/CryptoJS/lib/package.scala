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
  type SomeArray = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array
  type StreamCipher = typingsSlinky.cryptojs.CryptoJS.lib.IStreamCipher[js.Object]
}
